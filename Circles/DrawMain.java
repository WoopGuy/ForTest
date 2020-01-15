package Circles;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.Random;
public class DrawMain {

    public static void main(String[] args) {

        JFrame frame = new PaintFrame();
        frame.setDefaultCloseOperation(PaintFrame.EXIT_ON_CLOSE);
        frame.setSize(600, 500);
        frame.setVisible(true);

    }

}