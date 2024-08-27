package practice;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Code12_15 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("마우스 이벤트");
        frame.setLayout(new FlowLayout());

        JTextField txtX = new JTextField(5);
        JTextField txtY = new JTextField(5);

        frame.add(txtX);
        frame.add(txtY);

        frame.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {
                txtX.setText(Integer.toString(e.getX()));
                txtY.setText(Integer.toString(e.getY()));
            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        frame.setSize(250, 250);
        frame.setVisible(true);
    }
}
