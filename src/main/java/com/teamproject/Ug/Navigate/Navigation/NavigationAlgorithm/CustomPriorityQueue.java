package com.teamproject.Ug.Navigation.NavigationAlgorithm;

import java.util.Comparator;
import java.util.PriorityQueue;

public class CustomPriorityQueue {
    private PriorityQueue<src.NavigationAlgorithm.Node> priorityQueue;


    public CustomPriorityQueue() {
        this.priorityQueue = new PriorityQueue<>(Comparator.comparingDouble(node -> node.totalDistance));
        priorityQueue.add(new src.NavigationAlgorithm.Node(Integer.MAX_VALUE, null, Double.MAX_VALUE, Double.MAX_VALUE));
    }

    // Add a new Node to the priority queue
    public void add(src.NavigationAlgorithm.Node newNode) {

        priorityQueue.add(newNode);
    }

    // Removes the first element in the queue
    public src.NavigationAlgorithm.Node remove() {

        return priorityQueue.poll();
    }

    // Check if the queue is empty
    public boolean isEmpty() {

        return priorityQueue.isEmpty();
    }

}
