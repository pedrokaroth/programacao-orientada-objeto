package src.loadingscreen;

import javax.sound.sampled.Line;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;


import java.awt.*;
import java.awt.event.ActionListener;

public class LoadView extends JFrame {

    private JButton enterBtn;

    public LoadView() {
        setTitle("Converter");
        setSize(530,850);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setResizable(false);

        Load();

        setVisible(true);
    }

    private void Load() {

        JPanel root = new JPanel();
        ImageIcon image = new ImageIcon();

        root.setLayout(new BorderLayout());

        image = new ImageIcon("assets/imgs/load.png");
        JLabel background = new JLabel(image);
        background.setLocation(0,0);

        Border borderBtn = new LineBorder(new Color(63,61,86));
        enterBtn = new JButton("Entrar");
        enterBtn.setBounds(170,100,260,60);
        enterBtn.setFont(enterBtn.getFont ().deriveFont (35.0f));
        enterBtn.setBorder(borderBtn);
        enterBtn.setBackground(new Color(108,99,255));

        root.add(enterBtn);
        root.add(background);
        setContentPane(root);
    }

    public void setEnterBtnActionListener(ActionListener action)
    {
        enterBtn.addActionListener(action);
    }
}