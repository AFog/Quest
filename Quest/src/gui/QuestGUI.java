package gui;

import model.Quest;
import model.Scenes;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created by Aaron Fogarty on 01/12/2014.
 */
public class QuestGUI extends JFrame {

    private static final int FRAME_WIDTH = 400;
    private static final int FRAME_HEIGHT = 600;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    private JPanel questScroll, innerGrid, buttonGrid, inner2South, inner2North;
    private JLabel scrollLabel;
    private JTextField questChoice;
    private JButton select, clearButton, quitButton;

    Quest quest;//declares the Quest game

    public QuestGUI(final Quest q) {

        quest = q;//the quest object to be called from

        // Set window coordinates
        this.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        this.setTitle("QUEST");
        this.setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(this);
        this.setLayout(new BorderLayout());


        questScroll = new JPanel();
        innerGrid = new JPanel();
        buttonGrid = new JPanel();
        inner2South = new JPanel();
        inner2North = new JPanel();

        innerGrid.setLayout(new BorderLayout());
        innerGrid.setBorder(new TitledBorder("Quest"));
        this.add(innerGrid, BorderLayout.NORTH);
        innerGrid.add(questScroll, BorderLayout.NORTH);


        buttonGrid.setLayout(new BorderLayout());
        this.add(buttonGrid, BorderLayout.SOUTH);

        inner2North.setLayout(new BorderLayout());
        buttonGrid.add(inner2North, BorderLayout.NORTH);

        inner2South.setLayout(new BorderLayout());
        buttonGrid.add(inner2South, BorderLayout.SOUTH);


        //Scroll Path Text
        scrollLabel = new JLabel();
        scrollLabel.setPreferredSize(new Dimension(300, 480));
        questScroll.add(scrollLabel);

        //Quest choice field
        questChoice = new JTextField("", 15);
        inner2North.add(questChoice, BorderLayout.CENTER);


        //Quest select Button
        select = new JButton("Quest");
        select.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                scrollLabel.setText(q.getScroll(questChoice.getText()));
                questChoice.setText("");
            }
        });

        inner2North.add(select, BorderLayout.EAST);

        clearButton = new JButton("Clear");
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                questChoice.setText("");

            }
        });
        inner2South.add(clearButton, BorderLayout.EAST);


        quitButton = new JButton("Quit");
        quitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        inner2South.add(quitButton, BorderLayout.WEST);


        setOpening();

    }

    public void setOpening() {
        String s = "<html><h1>QUEST</h1><br>Type 'start' to play";
        scrollLabel.setText(s);
    }

}
