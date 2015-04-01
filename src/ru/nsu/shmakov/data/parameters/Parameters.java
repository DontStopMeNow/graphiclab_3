package ru.nsu.shmakov.data.parameters;

import java.awt.*;
import java.util.Vector;

/**
 * Created by Иван on 01.04.2015.
 */
public class Parameters {
    public int gridX;
    public int gridY;

    public double minX;
    public double maxX;
    public double minY;
    public double maxY;

    public int numOfColors;
    public Vector<Color> colors;
    public Color isoColor;

    public Parameters(int gridX, int gridY,
                      double minX, double maxX,
                      double minY, double maxY,
                      Vector<Color> colors, Color isoColor) {
        this.minX = minX;
        this.maxX = maxX;
        this.minY = minY;
        this.maxY = maxY;
        this.gridX = gridX;
        this.gridY = gridY;
        this.isoColor = isoColor;
        this.colors = colors;
        this.numOfColors = colors.size();
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

    public int getGridX() {
        return gridX;
    }

    public int getGridY() {
        return gridY;
    }

    public Color getIsoColor() {
        return isoColor;
    }

    public Vector<Color> getColors() {
        return colors;
    }

    public int getNumOfColors() {
        return numOfColors;
    }

    public double getWidth() {
        return Math.abs(maxX - minX);
    }

    public double getHeight() {
        return Math.abs(maxY - minY);
    }
}
