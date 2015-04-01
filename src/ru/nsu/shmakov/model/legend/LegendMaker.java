package ru.nsu.shmakov.model.legend;

import ru.nsu.shmakov.data.parameters.Parameters;

import java.awt.image.BufferedImage;

/**
 * Created by Иван on 01.04.2015.
 */
public interface LegendMaker {
    public void generateLegend(BufferedImage image, Parameters params);
}
