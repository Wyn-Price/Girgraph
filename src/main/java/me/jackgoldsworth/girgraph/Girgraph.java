package me.jackgoldsworth.girgraph;

import me.jackgoldsworth.girgraph.graph.Graph;
import me.jackgoldsworth.girgraph.opengl.Window;
import org.lwjgl.opengl.Display;

public class Girgraph {

    private static Graph currentGraph;
    private static Window window;

    public static void main(String[] args) {
        currentGraph = new Graph("Default", 50, 50);
        window = new Window();
        window.createDisplay(currentGraph.getName(), 1920, 1080);
        loop();
    }

    private static void loop() {
        while (!Display.isCloseRequested()) {
            window.updateDisplay(60);
        }
        window.destroyDisplay();
    }
}
