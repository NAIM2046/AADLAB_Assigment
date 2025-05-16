package bfs;

import java.util.*;

public class BFS {
    public static void bfs(List<List<Integer>> graph, int s) {
        boolean[] vist = new boolean[graph.size()];
        Queue<Integer> q = new ArrayDeque<>();
        vist[s] = true;
        q.add(s);
        System.out.print("BFS: ");
        while (!q.isEmpty()) {
            int node = q.poll();
            System.out.println(node + " ");
            for (int neighbor : graph.get(node)) {
                if (!vist[neighbor]) {
                    vist[neighbor] = true;
                    q.add(neighbor);
                }

            }
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> graph = new ArrayList<>();
        int n = 5;
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(0).add(4);
        bfs(graph, 0);

    }
}
