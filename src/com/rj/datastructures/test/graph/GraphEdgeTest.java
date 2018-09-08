package com.rj.datastructures.test.graph;

import com.rj.datastructures.src.graph.Graph;
import com.rj.datastructures.src.graph.GraphEdge;
import com.rj.datastructures.src.graph.GraphNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraphEdgeTest {

    @Test
    void equals() {
        Graph graph = new Graph();
        graph.addNode("A");
        graph.addNode("B");

        graph.addEdge("A", "B");

        GraphNode a = new GraphNode("A");
        GraphNode b = new GraphNode("B");
        GraphEdge e = new GraphEdge(a, b);

        GraphEdge e2 = null;

        for (GraphEdge edge : graph.getEdges()) {
            e2 = edge;
        }

        assertEquals(e, e2);
    }
}