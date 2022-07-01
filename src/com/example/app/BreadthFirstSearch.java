package com.example.app;

import java.util.ArrayList;
import java.util.LinkedList;

public class BreadthFirstSearch {
    public boolean BFS(ArrayList<ArrayList<Integer>> adj, int source,
                int destination, int noOfVertices, int pred[], int dist[])
    {
        LinkedList<Integer> queue = new LinkedList<>();

        boolean visited[] = new boolean[noOfVertices];

        for (int i = 0; i < noOfVertices; i++) {
            visited[i] = false;
            dist[i] = Integer.MAX_VALUE;
            pred[i] = -1;
        }

        visited[source] = true;
        dist[source] = 0;
        queue.add(source);

        while (!queue.isEmpty()) {
            int u = queue.remove();
            for (int i = 0; i < adj.get(u).size(); i++) {
                if (visited[adj.get(u).get(i)] == false) {
                    visited[adj.get(u).get(i)] = true;
                    dist[adj.get(u).get(i)] = dist[u] + 1;
                    pred[adj.get(u).get(i)] = u;
                    queue.add(adj.get(u).get(i));

                    if (adj.get(u).get(i) == destination)
                        return true;
                }
            }
        }
        return false;
    }
}
