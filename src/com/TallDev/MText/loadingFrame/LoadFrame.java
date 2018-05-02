package com.TallDev.MText.loadingFrame;

import com.TallDev.MText.loadingFrame.Util.ImagePanel;

import javax.swing.*;
import java.awt.*;

public class LoadFrame {

    static JFrame frame;
    public ImagePanel imagePanel;
    public JProgressBar progressBar;

    private static boolean isInitialized = false;

    public LoadFrame() {
        frame = new JFrame();
        imagePanel = new ImagePanel();
        progressBar = new JProgressBar();

        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        final Dimension d = frame.getToolkit().getScreenSize();
        frame.setLocation((int) ((d.getWidth() - frame.getWidth()) / 2), (int) ((d.getHeight() - frame.getHeight()) / 2));
        Dimension dim = new Dimension();
        d.setSize(307, 225);
        frame.setPreferredSize(d);
        frame.setUndecorated(true);
        frame.add(imagePanel);
        //frame.add(progressBar);
        //frame.setExtendedState(JFrame.MAXIMIZED_BOTH);

        frame.pack();
        isInitialized = true;
    }

    public static void setVisible(boolean v) {
        if (isInitialized) {
            frame.setVisible(v);
        }

    }

}
