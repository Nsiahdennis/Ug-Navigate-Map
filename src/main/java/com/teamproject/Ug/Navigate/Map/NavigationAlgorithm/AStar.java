package com.teamproject.Ug.Navigate.Map.NavigationAlgorithm;


import java.util.*;

import org.springframework.ui.Model;

public class AStar {
//    Path filePath = Paths.get("com/teamproject/Ug/Navigate/Map/NavigationAlgorithm/UG-location.cs");
    static ArrayList<List<Integer>> routes = new ArrayList<>();
    static ArrayList<Double> distances = new ArrayList<>();
    private  int start;
    private  int stop;

    public AStar(int start, int stop){
        this.stop = stop;
        this.start =start;
    }


    static ArrayList<String[]> csvContents = ReadCSV.readCSV("src/main/java/com/teamproject/Ug/Navigate/Map/NavigationAlgorithm/UG-locations.csv");
    static double dist = 0;
    static void getSolution(Node node, int end){
        ArrayList<Integer> path = new ArrayList<>();
        while(node.parent != null){
            path.add(node.id);
            if(node.id == end) {
                dist = node.totalDistance;
            }
            node = node.parent;
        }
        path.add(node.id);
        distances.add(dist);
        List<Integer> reversedPath = new ArrayList<>(path);
        Collections.reverse(reversedPath);

        routes.add(reversedPath);
    }
    public  int Astar() {
        Set<Integer> visited = new HashSet<>();
        CustomPriorityQueue queue = new CustomPriorityQueue();
        queue.add(new Node(this.start, null, 0, 0));

        while (!queue.isEmpty()) {
            Node node = queue.remove();
            if (node == null) {
                break;
            }

            if (node.id != Integer.MAX_VALUE) {
                int currentNode = node.id;
                double currentCost = node.costToNode;

                if (currentNode == this.stop) {
                    getSolution(node,this.stop);
                    if (routes.size() == 6){
                        break;
                    }

                    continue;
                }

                if (visited.contains(currentNode)) {
                    continue;
                }

                visited.add(currentNode);

                for (int neighbour: Util.getNeighbours(currentNode)) {
                    double newDistance = currentCost + Util.getDistance(currentNode, neighbour);
                    double heuristic = Util.getDistance(neighbour, this.stop);
                    queue.add(new Node(neighbour, node, newDistance, heuristic));
                }
            }
        }
        System.out.println("Shortest path: " + routes.get(0));
        for (int id: routes.get(0)) {
            System.out.println(ReadCSV.getNameById(csvContents,id));
        }
        System.out.println("Distance: " + distances.get(0));
        System.out.println(routes);
        System.out.println(distances);
        return -1;
    }
//    public static void main(String[] args){
//        //Astar(113,24);
//        //Astar(16, 24);
//         Astar(16, 323);
//    }
}


