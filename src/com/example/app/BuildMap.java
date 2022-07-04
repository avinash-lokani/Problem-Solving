package com.example.app;

import java.util.ArrayList;

// Main..
public class BuildMap {

    public static void main(String[] args)
    {
        BuildMap obj = new BuildMap();

        int noOfVertices = 8;

        ArrayList<ArrayList<Integer>> map =
                new ArrayList<ArrayList<Integer>>(noOfVertices);
        for (int i = 0; i < noOfVertices; i++) {
            map.add(new ArrayList<Integer>());
        }
        obj.addEdge(map, 0, 1);
        obj.addEdge(map, 0, 3);
        obj.addEdge(map, 1, 2);
        obj.addEdge(map, 3, 4);
        obj.addEdge(map, 3, 7);
        obj.addEdge(map, 4, 5);
        obj.addEdge(map, 4, 6);
        obj.addEdge(map, 4, 7);
        obj.addEdge(map, 5, 6);
        obj.addEdge(map, 6, 7);
        int source = 0, dest = 7;

        ShortestDistance route1 = new ShortestPath();
        route1.shortestDistance(map, source, dest, noOfVertices);
    }


    private void addEdge(ArrayList<ArrayList<Integer>> map, int i, int j)
    {
        map.get(i).add(j);
        map.get(j).add(i);
    }

}


