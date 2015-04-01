package ru.nsu.shmakov;

import ru.nsu.shmakov.data.function.Hyperboloid;
import ru.nsu.shmakov.data.function.MyFunction1;
import ru.nsu.shmakov.data.parameters.Parameters;
import ru.nsu.shmakov.data.parameters.ParametersReader;
import ru.nsu.shmakov.model.legend.LegendMaker;
import ru.nsu.shmakov.model.plotter.DefaultPlotter;
import ru.nsu.shmakov.model.plotter.Plotter;
import ru.nsu.shmakov.view.MainForm;

import java.awt.image.BufferedImage;

/**
 * Created by Иван on 30.03.2015.
 */
public class Main {
    public static void main(String[] args) {
        Parameters parameters = ParametersReader.getParameters("./resources/params.txt");
        MainForm mainForm = new MainForm();
        Plotter plotter = new DefaultPlotter();
        BufferedImage plot   = new BufferedImage(mainForm.getPlotWidth()  , mainForm.getPlotHeight()  , BufferedImage.TYPE_4BYTE_ABGR);
        BufferedImage legend = new BufferedImage(mainForm.getLegendWidth(), mainForm.getLegendHeight(), BufferedImage.TYPE_4BYTE_ABGR);

        LegendMaker.generateLegend(legend, parameters);
        plotter.generatePlot(plot, new MyFunction1(), parameters);

        mainForm.setPlot(plot);
        mainForm.setLegend(legend);
    }

}
