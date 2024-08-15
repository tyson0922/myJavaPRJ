package practice;

import javax.swing.*;
import java.awt.*;

public class Code12_07 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("문자 입력");
        frame.setLayout(new FlowLayout());

        JTextField txt1 = new JTextField(10);
        frame.add(txt1);

        JTextArea txt2 = new JTextArea(5, 10);
        frame.add(txt2);
        frame.add(new JScrollPane(txt2));

        JPasswordField txt3 = new JPasswordField(10);
        frame.add(txt3);

        frame.setSize(250, 250);
        frame.setVisible(true);
    }
}
