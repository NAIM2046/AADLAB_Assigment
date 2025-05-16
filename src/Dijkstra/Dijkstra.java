package Dijkstra;

import java.lang.reflect.Array;
import java.util.*;

public class Dijkstra {

    static class Edge {
        int node;
        int weight;

        Edge(int node, int weight) {
            this.node = node;
            this.weight = weight;
        }

    }

    public static void dijkstrs(List<List<Edge>> graph, int s) {
        int n = graph.size();
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[s] = 0;
        PriorityQueue<Edge> pq = new PriorityQueue<>(Comparator.comparingInt(e -> e.weight));
        pq.add(new Edge(0, s));
        while (!pq.isEmpty()) {
            Edge current = pq.poll();
            int node = current.node;
            if (current.weight > dist[node])
                continue;
            for (Edge neighbor : graph.get(node)) {
                int v = neighbor.node;
                int w = neighbor.weight;
                if (dist[node] + w < dist[v]) {
                    dist[v] = dist[node] + w;
                    pq.add(new Edge(v, dist[v]));
                }
            }
        }
        System.out.println("Shortest distances from node " + s + ":");
        for (int i = 0; i < n; i++) {
            System.out.println("To node " + i + " = " + (dist[i] == Integer.MAX_VALUE ? "∞" : dist[i]));
        }
    }

    public static void main(String[] args) {
        int v = 6;
        List<List<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            graph.add(new ArrayList<>());
        }
        graph.get(0).add(new Edge(1, 4));
        graph.get(0).add(new Edge(2, 1));
        graph.get(2).add(new Edge(1, 2));
        graph.get(1).add(new Edge(3, 1));
        graph.get(2).add(new Edge(3, 5));
        graph.get(3).add(new Edge(4, 3));
        graph.get(4).add(new Edge(5, 1));
        graph.get(3).add(new Edge(5, 2));
        dijkstrs(graph, 0);

    }
}
