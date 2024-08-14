package practice;

import javax.swing.*;
import java.awt.*;

public class Code12_06 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("문자 입력");
        frame.setLayout(new FlowLayout());

        ImageIcon img1 = new ImageIcon("C:/FirstJava/images/image1.png");
        ImageIcon img2 = new ImageIcon("C:/FirstJava/images/java1.png");

        JLabel label1 = new JLabel(img1);
        frame.add(label1);

        JButton button1 = new JButton("클릭하세요", img2);
        frame.add(button1);

        frame.setSize(250, 250);
        frame.setVisible(true);
    }
}
