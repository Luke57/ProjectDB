package Parkeersimulator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

/**
 * Created by AntonKok on 20-1-2017.
 */

public class GraficalUserInterface {
    private JPanel panel;
    private JButton button1;
    private JButton RunGerage;
    //    private JButton OpenGerage;
//    private Simulator sim;

    public GraficalUserInterface() {
        RunGerage.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Runner.rennen();
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GraficalUserInterface");
        frame.setContentPane(new GraficalUserInterface().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
