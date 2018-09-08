package com.rj.datastructures.src.graph;

import java.util.ArrayList;
import java.util.List;

public class Graph {
    private List<GraphNode> nodes = new ArrayList<>();
    private List<GraphEdge> edges = new ArrayList<>();

    public Graph() {
    }

    public void addNode(String name) {
        nodes.add(new GraphNode(name));
    }

    public void addEdge(String start, String end) {
        GraphNode startNode = new GraphNode(start);
        GraphNode endNode = new GraphNode(end);
        GraphEdge e = new GraphEdge(startNode, endNode);
        edges.add(e);
    }

    public List<GraphNode> getNodes() {
        return nodes;
    }

    public List<GraphEdge> getEdges() {
        return edges;
    }
}
