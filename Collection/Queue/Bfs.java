import java.util.*;

public class Bfs{
    public static void main(String[] args) {
        int n = 6; // number of nodes in the graph
        List<Integer>[] graph = new List[n];
        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }
        graph[0].add(1);
        graph[0].add(2);
        graph[1].add(3);
        graph[1].add(4);
        graph[2].add(4);
        graph[3].add(5);
        graph[4].add(5);

        int startNode = 0; // starting node for BFS
        int targetNode = 5; // target node to find the level of

        int[] level = new int[n]; // array to store the level of each node
        Arrays.fill(level, -1); // set all levels to -1 (unvisited)

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(startNode); // add starting node to the queue
        level[startNode] = 0; // set level of starting node to 0

        while (!queue.isEmpty()) {
            int currentNode = queue.poll();
            for (int neighbor : graph[currentNode]) {
                if (level[neighbor] == -1) { // if neighbor is unvisited
                    level[neighbor] = level[currentNode] + 1; // set level of neighbor
                    queue.add(neighbor); // add neighbor to the queue
                }
            }
        }

        System.out.println("Level of node " + targetNode + " is " + level[targetNode]);
    }
}
