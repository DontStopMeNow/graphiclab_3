package ru.nsu.shmakov.view;

import javax.swing.*;
import javax.swing.event.AncestorListener;
import javax.swing.plaf.DimensionUIResource;
import java.awt.event.HierarchyEvent;
import java.awt.event.HierarchyListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.io.IOException;

/**
 * Created by Иван on 01.04.2015.
 */
public class MainForm  extends JFrame {
    private JPanel rootPanel;
    private JRadioButton defaultRadioButton;
    private JRadioButton interpolationRadioButton;
    private JRadioButton ditheringRadioButton;
    private ImagePanel legend;
    private ImagePanel plot;

    public MainForm() {
        super("Main Frame");
        setContentPane(rootPanel);

        pack();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new DimensionUIResource(600, 600));

        setSize(1500, 900);
        setVisible(true);

        repaint();
        plot.addPropertyChangeListener(new PropertyChangeListener() {
            @Override
            public void propertyChange(PropertyChangeEvent evt) {
                System.out.println(plot.getWidth());
                System.out.println(plot.getHeight());
            }
        });

    }
}
