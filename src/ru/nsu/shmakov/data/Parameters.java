package ru.nsu.shmakov.data;

import java.awt.*;
import java.util.Vector;

/**
 * Created by Иван on 01.04.2015.
 */
public class Parameters {
    private double minX;
    private double maxX;
    private double minY;
    private double maxY;
    private int numOfColors;
    private Vector<Color> colors;

    public Parameters(int minX, int maxX, int minY, int maxY, Vector<Color> colors) {
        this.minX = minX;
        this.maxX = maxX;
        this.minY = minY;
        this.maxY = maxY;
        this.colors = colors;
        numOfColors = colors.size();
    }

    public double getWidth() {
        return maxX - minX;
    }

    public double getHeight() {
        return maxY - minY;
    }

    public double getMinX() {
        return minX;
    }

    public double getMaxX() {
        return maxX;
    }

    public double getMinY() {
        return minY;
    }

    public double getMaxY() {
        return maxY;
    }

    public int getNumOfColors() {
        return numOfColors;
    }

    public Vector<Color> getColors() {
        return colors;
    }
}
