package com.rj.datastructures.src.graph;

public class GraphUtils {
    public static void printAdjacencyMatrix(Graph graph) {
        System.out.print(" ");

        for (GraphNode node : graph.getNodes()) {
            System.out.print("    " + node.getName());
        }

        System.out.println();

        for (GraphNode fromNode : graph.getNodes()) {
            System.out.print(fromNode.getName());

            for (GraphNode toNode : graph.getNodes()) {
                GraphEdge edge = new GraphEdge(fromNode, toNode);
                if (graph.getEdges().contains(edge)) {
                    System.out.print("    1");
                } else {
                    System.out.print("    0");
                }
            }
            System.out.println();
        }
    }

    public static void DFS(Graph g) {
        DfsHelper();
    }

    private static void DfsHelper() {

    }
}
