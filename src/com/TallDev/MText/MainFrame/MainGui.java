package com.TallDev.MText.MainFrame;

import com.TallDev.MText.MainFrame.Util.Util;

import javax.swing.*;

public class MainGui {
    private JPanel root;
    private JButton ichBinEinBeispielButton;


    public static JFrame frame;

    public MainGui() {
        /*
            Creates a Window with settings found in Util.Util.initJFrame
         */
        frame = Util.initJFrame();


        /*
            Add everything we created in the Gui Designer
         */
        frame.add(root);


        /*
            Make visible
         */
        frame.setVisible(true);



    }

}
