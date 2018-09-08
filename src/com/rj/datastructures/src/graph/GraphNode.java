package com.rj.datastructures.src.graph;

import java.util.List;

public class GraphNode {
    String name;
    int weight;

    public GraphNode(String name) {
        this.name = name;
    }

    public GraphNode(String name, int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
