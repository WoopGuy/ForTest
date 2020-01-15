package Circles;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import java.util.Random;

class PaintPanel extends JPanel {

    public PaintPanel() {
        setSize(500, 500);
        setBackground(Color.white);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Random random = new Random();
        g.setColor(Color.BLACK);
        // draw 5 random circles
        int count = 1000000;
        for (int i = 0; i < count; i++) {
            g.drawOval(random.nextInt(250), random.nextInt(250),
                    random.nextInt(250), random.nextInt(250));
        }
    }

}