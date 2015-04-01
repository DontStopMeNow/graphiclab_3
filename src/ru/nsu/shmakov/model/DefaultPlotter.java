package ru.nsu.shmakov.model;

import ru.nsu.shmakov.data.Function;
import ru.nsu.shmakov.data.Parameters;

import java.awt.image.BufferedImage;

/**
 * Created by Иван on 01.04.2015.
 */
public class DefaultPlotter implements Plotter {
    @Override
    public void getPlot(BufferedImage image, Function function, Parameters params) {
        int imageWidth  = image.getWidth ();
        int imageHeight = image.getHeight();
        double domainWidth  = params.getWidth ();
        double domainHeight = params.getHeight();

        double stepX = imageWidth  / domainWidth ;
        double stepY = imageHeight / domainHeight;
    }
}
