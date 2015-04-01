package ru.nsu.shmakov.data.parameters;

import ru.nsu.shmakov.data.parameters.Parameters;

import java.awt.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Scanner;
import java.util.Vector;

/**
 * Created by Иван on 01.04.2015.
 */
public class ParametersReader {
    public static Parameters getParameters(String filename) {
        Parameters params = null;
        InputStream is = null;
        try {
            is = new FileInputStream(filename);
            Scanner scanner = new Scanner(is);
            int gridX = scanner.nextInt();
            int gridY = scanner.nextInt();

            int minX = scanner.nextInt();
            int minY = scanner.nextInt();

            int maxX = scanner.nextInt();
            int maxY = scanner.nextInt();

            int noc = scanner.nextInt();
            Vector<Color> colors = new Vector<Color>();
            for (int i = 0; i < noc; i++) {
                int r = scanner.nextInt();
                int g = scanner.nextInt();
                int b = scanner.nextInt();
                colors.add(new Color(r, g, b, 255));
            }
            int r = scanner.nextInt();
            int g = scanner.nextInt();
            int b = scanner.nextInt();
            Color isoColor = new Color(r, g, b, 255);

            params = new Parameters(gridX, gridY, minX, maxX, minY, maxY, colors, isoColor);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        if (params == null)
            throw new RuntimeException("Cannot read the params");
        return params;
    }
}
