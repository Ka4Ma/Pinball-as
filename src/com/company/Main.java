package com.company;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Main {
    public static void main(String[] args){
        JFrame frame = new JFrame();
        frame.setSize(1366,768);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Pinball panel = new Pinball();
        frame.add(panel);
        frame.setVisible(true);

    }
}





