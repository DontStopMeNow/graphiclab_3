package ru.nsu.shmakov.model;

import ru.nsu.shmakov.data.Function;
import ru.nsu.shmakov.data.Parameters;

import java.awt.image.BufferedImage;
import java.lang.reflect.Parameter;

/**
 * Created by Иван on 30.03.2015.
 */
public interface Plotter {
    public void getPlot(BufferedImage image, Function function, Parameters params);
}
