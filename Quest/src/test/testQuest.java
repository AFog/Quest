
package test;

import gui.QuestGUI;

import model.Quest;
import model.Scenes;

/**
 * Created by Aaron Fogarty on 01/12/2014.
 */
public class testQuest {

    public static void main(String[] args) {

        Scenes s = new Scenes();//initialises the class that contains the story
        Quest one = new Quest(s);//the program that takes a story

        QuestGUI run = new QuestGUI(one);
        run.setVisible(true);

    }
}