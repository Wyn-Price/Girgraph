package me.jackgoldsworth.girgraph.graph;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Graph {

    private String name;
    // The x and y that the graph will stretch to
    private int x;
    private int y;

    public Graph(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }
}
