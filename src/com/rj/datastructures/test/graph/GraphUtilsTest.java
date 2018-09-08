package com.rj.datastructures.test.graph;

import com.rj.datastructures.src.graph.Graph;
import com.rj.datastructures.src.graph.GraphUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GraphUtilsTest {

    @Test
    void test_printAdjacencyMatrix(){
        Graph graph = new Graph();
        graph.addNode("A");
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");
        graph.addNode("E");
        graph.addNode("F");
        graph.addNode("G");

        graph.addEdge("A","B");
        graph.addEdge("A","G");
        graph.addEdge("B","E");
        graph.addEdge("E","C");
        graph.addEdge("C","D");
        graph.addEdge("D","G");
        graph.addEdge("G","A");

        GraphUtils.printAdjacencyMatrix(graph);
    }

}