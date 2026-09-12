package ru.gr05504.ui;

import javax.swing.*;
import java.awt.*;

public class MainWindow extends JFrame {
    private final JCheckBox check1;
    private final JCheckBox check2;
    private final ButtonGroup buttonGroup; // для объединения RadioButton
    private final JRadioButton rButton1;
    private final JRadioButton rButton2;
    private final JRadioButton rButton3;
    private final JButton button1;
    private final JButton button2;
    private final JButton buttonExit;
    private final JPanel mainPanel;
    private final JPanel controlPanel;

    public MainWindow(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Window");
        setMinimumSize(new Dimension(500,300));
        mainPanel = new JPanel();
        mainPanel.setBackground(Color.RED);
        controlPanel = new JPanel();
        add (mainPanel,BorderLayout.CENTER );
        add (controlPanel,BorderLayout.SOUTH);

        check1 = new JCheckBox("Опция 1");
        check2 = new JCheckBox("Опция 2");

        buttonGroup = new ButtonGroup();
        rButton1 = new JRadioButton("Вариант 1");
        rButton2 = new JRadioButton("Вариант 2");
        rButton3 = new JRadioButton("Вариант 3");

        // добавляем те RadioButton, которые должны зависеть друг от друга
        buttonGroup.add(rButton1);
        buttonGroup.add(rButton2);
        buttonGroup.add(rButton3);

        button1 = new JButton("Кнопка 1");
        button2 = new JButton("Кнопка 2");
        buttonExit = new JButton("Выход");
        GroupLayout gl = new GroupLayout(controlPanel);
        controlPanel.setLayout(gl);
        gl.setHorizontalGroup(gl.createSequentialGroup()
                .addGap(8)
                .addGroup(gl.createParallelGroup()
                        .addComponent(check1, PS, PS, PS)
                        .addComponent(check2, PS, PS, PS)
                )
                .addGap(8)
                .addGroup(gl.createParallelGroup()
                        .addComponent(rButton1, PS, PS, PS)
                        .addComponent(rButton2, PS, PS, PS)
                        .addComponent(rButton3, PS, PS, PS)
                )
                .addGap(8, 8, Short.MAX_VALUE)
                .addGroup(gl.createParallelGroup()
                        .addComponent(button1, PS, PS, PS)
                        .addComponent(button2, PS, PS, PS)
                )
                .addGap(8)
                .addComponent(buttonExit, PS, PS, PS)
                .addGap(8)
        );
        gl.setVerticalGroup(gl.createSequentialGroup()
                .addGap(7)
                .addGroup(gl.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addGroup(GroupLayout.Alignment.LEADING,
                                gl.createSequentialGroup()
                                .addComponent(check1, PS, PS, PS )
                                .addComponent(check2, PS, PS, PS )
                        )
                        .addGroup(gl.createSequentialGroup()
                                .addComponent(rButton1, PS, PS, PS )
                                .addComponent(rButton2, PS, PS, PS )
                                .addComponent(rButton3, PS, PS, PS )
                        )
                        .addGroup(gl.createSequentialGroup()
                                .addComponent(button1, PS, PS, PS )
                                .addGap(8)
                                .addComponent(button2, PS, PS, PS )
                        )
                        .addComponent(buttonExit,PS,PS,PS )

                )
                .addGap(4)


        );

        pack();
        setLocationRelativeTo(null);

    }
    private static final int PS = GroupLayout.PREFERRED_SIZE;
}
