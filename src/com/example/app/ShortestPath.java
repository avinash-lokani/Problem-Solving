package com.example.app;

import java.util.ArrayList;
import java.util.LinkedList;


public class ShortestPath implements ShortestDistance {
    @Override
    public void shortestDistance(ArrayList<ArrayList<Integer>> map, int source, int destination, int noOfVertices) {
            int predecessor[] = new int[noOfVertices];
            int distance[] = new int[noOfVertices];

            BreadthFirstSearch bfs = new BreadthFirstSearch();

            if (bfs.BFS(map, source, destination, noOfVertices, predecessor, distance) == false) {
                System.out.println("Given source and destination" +
                        "are not connected");
                return;
            }

            LinkedList<Integer> path = new LinkedList<Integer>();
            int crawl = destination;
            path.add(crawl);
            while (predecessor[crawl] != -1) {
                path.add(predecessor[crawl]);
                crawl = predecessor[crawl];
            }

            System.out.println("Shortest path length is: " + distance[destination]);

            System.out.println("Path is ::");
            for (int i = path.size() - 1; i >= 0; i--) {
                System.out.print(path.get(i) + " ");
            }
    }
}
