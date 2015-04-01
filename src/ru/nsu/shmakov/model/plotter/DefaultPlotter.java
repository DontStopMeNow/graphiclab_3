package ru.nsu.shmakov.model.plotter;

import ru.nsu.shmakov.data.function.Function;
import ru.nsu.shmakov.data.parameters.Parameters;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Vector;

/**
 * Created by Иван on 01.04.2015.
 */
public class DefaultPlotter implements Plotter {
    @Override
    public void generatePlot(BufferedImage image, Function function, Parameters params) {
        int imageWidth  = image.getWidth ();
        int imageHeight = image.getHeight();
        double domainWidth  = params.getWidth ();
        double domainHeight = params.getHeight();

        double stepX = domainWidth  / imageWidth ;
        double stepY = domainHeight / imageHeight;
        int noc = params.getNumOfColors();
        Vector<Color> colors = params.getColors();

        double max = function.getMax(params.getMinX(), params.getMinY(), params.getMaxX(), params.getMaxY(), stepX, stepY);
        double min = function.getMin(params.getMinX(), params.getMinY(), params.getMaxX(), params.getMaxY(), stepX, stepY);
        for (int imageX = 0; imageX < imageWidth; imageX++) {
            double plotX = imageX*stepX + params.getMinX();
            for (int imageY = 0; imageY < imageHeight; imageY++) {
                double plotY = imageY*stepY + params.getMinY();
                double value = function.getValue(plotX, plotY);
                //System.out.println("(" + plotX + " ; " + plotY + "}");
                int colorID = (int)Math.round(((value - min) / (max - min)) * (noc) );
                if (colorID < 0) {
                    colorID = 0;
                }
                if (colorID > noc - 1) {
                    colorID = noc - 1;
                }
                image.setRGB(imageX, imageY, colors.get(colorID).getRGB());
            }
        }
    }
}
