package com.TallDev.MText.MainFrame.Util;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;

public class Util {

    public static JFrame initJFrame() {
        JFrame frame = new JFrame();

        frame.setLocationRelativeTo(null);
        frame.setPreferredSize(new Dimension(1280, 700));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.pack();
        frame.addComponentListener(new ComponentAdapter()
        {
            public void componentResized(ComponentEvent evt) {
                Component c = (Component)evt.getSource();
                // TODO: Add size print
            }
        });
        return frame;

    }


}
