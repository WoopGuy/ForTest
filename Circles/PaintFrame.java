package Circles;
import java.awt.event.*;
        import java.awt.*;
        import javax.swing.*;
        import java.util.Random;


public class PaintFrame extends JFrame {

    private JPanel content = new JPanel();
    private JButton drawButton = new JButton("Draw");
    private PaintPanel paintPanel = new PaintPanel();

    public PaintFrame() {

        getContentPane().add(content);
        content.setLayout(new BorderLayout());

        drawButton.setSize(100, 500);
        drawButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // drawButton is fired, repaint the paintPanel
                paintPanel.repaint();
            }
        });
        content.add(drawButton, BorderLayout.WEST);
        content.add(paintPanel, BorderLayout.CENTER);
    }

}