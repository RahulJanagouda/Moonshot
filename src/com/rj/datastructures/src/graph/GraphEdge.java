package com.rj.datastructures.src.graph;

public class GraphEdge {
    GraphNode start;
    GraphNode end;

    public GraphEdge(GraphNode start, GraphNode end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public boolean equals(Object obj) {
        GraphEdge that = (GraphEdge) obj;
        return that.end.name.equals(this.end.name) && that.start.name.equals(this.start.name);
    }

    @Override
    public int hashCode() {
        String s = this.start.name + this.end.name;
        return s.hashCode();
    }
}
