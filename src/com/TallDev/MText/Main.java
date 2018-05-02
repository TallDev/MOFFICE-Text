package com.TallDev.MText;

import com.TallDev.MText.MainFrame.MainGui;
import com.TallDev.MText.MainFrame.Util.Util;
import com.TallDev.MText.loadingFrame.LoadFrame;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        /*
            Muss GANZ am anfang definiert werden
         */
        try {   UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());    } catch (Exception e) {e.printStackTrace();}

        new LoadFrame();
        LoadFrame.setVisible(true);
        new Util();
        try {    Thread.sleep(1000);   } catch (Exception e) {e.printStackTrace();}
        LoadFrame.setVisible(false);
        new MainGui();
    }

}
