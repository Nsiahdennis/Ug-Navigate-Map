package src.NavigationAlgorithm;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AStar {
    static ArrayList<List<Integer>> routes = new ArrayList<>();
    static ArrayList<Double> distances = new ArrayList<>();

    static ArrayList<String[]> csvContents = src.NavigationAlgorithm.ReadCSV.readCSV("src/NavigationAlgorithm/UG-locations.csv");
    static double dist = 0;
    static void getSolution(src.NavigationAlgorithm.Node node, int end){
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
        routes.add(path.reversed());
    }
    public static int Astar(int start, int end) {
        Set<Integer> visited = new HashSet<>();
        src.NavigationAlgorithm.CustomPriorityQueue queue = new src.NavigationAlgorithm.CustomPriorityQueue();
        queue.add(new src.NavigationAlgorithm.Node(start, null, 0, 0));

        while (!queue.isEmpty()) {
            src.NavigationAlgorithm.Node node = queue.remove();
            if (node == null) {
                break;
            }

            if (node.id != Integer.MAX_VALUE) {
                int currentNode = node.id;
                double currentCost = node.costToNode;

                if (currentNode == end) {
                    getSolution(node,end);
                    if (routes.size() == 6){
                        break;
                    }

                    continue;
                }

                if (visited.contains(currentNode)) {
                    continue;
                }

                visited.add(currentNode);

                for (int neighbour: src.NavigationAlgorithm.Util.getNeighbours(currentNode)) {
                    double newDistance = currentCost + src.NavigationAlgorithm.Util.getDistance(currentNode, neighbour);
                    double heuristic = src.NavigationAlgorithm.Util.getDistance(neighbour, end);
                    queue.add(new src.NavigationAlgorithm.Node(neighbour, node, newDistance, heuristic));
                }
            }
        }
        System.out.println("Shortest path: " + routes.get(0));
        for (int id: routes.get(0)) {
            System.out.println(src.NavigationAlgorithm.ReadCSV.getNameById(csvContents,id));
        }
        System.out.println("Distance: " + distances.get(0));
        System.out.println(routes);
        System.out.println(distances);
        return -1;
    }
    public static void main(String[] args){
        //Astar(113,24);
        //Astar(16, 24);
         Astar(16, 323);
    }
}


