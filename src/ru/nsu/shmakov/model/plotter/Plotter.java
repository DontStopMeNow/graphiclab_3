package ru.nsu.shmakov.model.plotter;

import ru.nsu.shmakov.data.function.Function;
import ru.nsu.shmakov.data.parameters.Parameters;

import java.awt.image.BufferedImage;

/**
 * Created by Иван on 30.03.2015.
 */
public interface Plotter {
    public void generatePlot(BufferedImage image, Function function, Parameters params);
}
