package ru.nsu.shmakov.data;

/**
 * Created by Иван on 30.03.2015.
 */
public interface Function {
    public double getValue(double x, double y);
    public double getDerivativeDx (double x, double y);
    public double getDerivativeDy (double x, double y);
    public double getDerivativeDxDy (double x, double y);
    public double getMax(double x1, double y1, double x2, double y2, double stepX, double stepY);
    public double getMin(double x1, double y1, double x2, double y2, double stepX, double stepY);
}
