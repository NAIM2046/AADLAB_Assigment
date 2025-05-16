package dfs;

import java.util.*;

public class DFS {
    static void dfs(List<List<Integer>> graph, int node, boolean[] vist) {
        vist[node] = true;
        System.out.print(node + " ");
        for (int neighbor : graph.get(node)) {
            if (!vist[neighbor]) {
                dfs(graph, neighbor, vist);
            }
        }

    }

    public static void main(String[] args) {
        int n = 5;
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(1);
        graph.get(0).add(2);
        graph.get(1).add(3);
        graph.get(2).add(4);

        boolean[] vist = new boolean[n];
        System.out.print("DFS: ");
        dfs(graph, 0, vist);

    }
}
