package ru.nsu.shmakov.model.legend;

import ru.nsu.shmakov.data.parameters.Parameters;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.Vector;

/**
 * Created by Иван on 01.04.2015.
 */
public class LegendMaker {
    public static void generateLegend(BufferedImage image, Parameters params) {
        int legendWidth  = image.getWidth ();
        int legendHeight = image.getHeight();

        int noc = params.getNumOfColors();
        int colHeight = legendHeight/noc;

        Vector<Color> colors = params.getColors();
        for (int x = 0; x < legendWidth; x++) {
            for (int y = 0; y < legendHeight; y++) {
                int colorID  = noc - (int)Math.round(((y) / (colHeight))) - 1;
                if (colorID < 0) {
                    colorID = 0;
                }
                if (colorID > noc - 1) {
                    colorID = noc - 1;
                }
                image.setRGB(x, y, colors.get(colorID).getRGB());
            }
        }

    }
}
