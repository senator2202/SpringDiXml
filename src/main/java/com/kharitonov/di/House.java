package com.kharitonov.di;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class House {
    private Window window;
    private int height;
    private Material wall;
    //private Collection<Door> doors;
    private Map<String, Door> doors;

    public House(Window window, int height) {
        this.window = window;
        this.height = height;
    }

    public House(Window window) {
        this.window = window;
    }

    public Material getWall() {
        return wall;
    }

    public void setWall(Material wall) {
        this.wall = wall;
    }

    public Window getWindow() {
        return window;
    }

    public void setWindow(Window window) {
        this.window = window;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void view() {
        window.open();
    }

    public void buildWall(){
        for (int i = 0; i < height; i++) {
            System.out.println("Этаж " + i);
            wall.cover();
        }
    }

    public void installDoors() {
        for (Map.Entry<String, Door> entry : doors.entrySet()) {
            System.out.println("Ключ " + entry.getKey());
            entry.getValue().install();
        }
    }

    public Map<String, Door> getDoors() {
        return doors;
    }

    public void setDoors(Map<String, Door> doors) {
        this.doors = doors;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("House{");
        sb.append("window=").append(window);
        sb.append(", height=").append(height);
        sb.append(", wall=").append(wall);
        sb.append('}');
        return sb.toString();
    }
}
