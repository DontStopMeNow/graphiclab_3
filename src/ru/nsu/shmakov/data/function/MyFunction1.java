package ru.nsu.shmakov.data.function;

import ru.nsu.shmakov.data.function.Function;

/**
 * Created by Иван on 30.03.2015.
 */
public class MyFunction1 implements Function {
    @Override
    public double getValue(double x, double y) {
        return x*Math.sin(x + y);
    }
    @Override
    public double getMax(double x1, double y1, double x2, double y2, double stepX, double stepY) {
        double[] norm = normalize(x1, y1, x2, y2);
        x1 = norm[0]; x2 = norm[2]; y1 = norm[1]; y2 = norm[3];

        double max = getValue(x1, y1);
        for (double x = x1; x < x2; x += stepX) {
            for (double y = y1; y < y2; y += stepY) {
                double value = getValue(x, y);
                if(value > max) {
                    max = value;
                }
            }
        }

        return max;
    }

    @Override
    public double getMin(double x1, double y1, double x2, double y2, double stepX, double stepY) {
        double[] norm = normalize(x1, y1, x2, y2);
        x1 = norm[0]; x2 = norm[2]; y1 = norm[1]; y2 = norm[3];

        double min = getValue(x1, y1);
        for (double x = x1; x < x2; x += stepX) {
            for (double y = y1; y < y2; y += stepY) {
                double value = getValue(x, y);
                if(value < min) {
                    min = value;
                }
            }
        }

        return min;
    }

    private double[] normalize(double x1, double y1, double x2, double y2) {
        double[] vect2 = new double[4];
        if (x1 > x2) {
            vect2[0] = x2; // x1 = x2
            vect2[2] = x1; // x2 = x1
        }
        else {
            vect2[0] = x1; // x1 = x1
            vect2[2] = x2; // x2 = x2
        }

        if (y1 > y2) {
            vect2[1] = y2; // y1 = y2
            vect2[3] = y1; // y2 = y1
        }
        else {
            vect2[1] = y1; // y1 = y1
            vect2[3] = y2; // y2 = y2
        }
        return vect2;
    }
}
