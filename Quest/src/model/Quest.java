package model;

import java.util.ArrayList;

/**
 * Created by Aaron Fogarty on 01/12/2014.
 */
public class Quest {

    ArrayList<Scrolls> scrolls;
    String scroll = "";//String that is displayed with the current choice

    Scenes questScenes;//declares the selected story,in this case the story is the Scenes class
    Scrolls currentScroll;

    public Quest(Scenes s) {
        questScenes = s;// initialises the story that is being used
        currentScroll = questScenes.getScroll(0);//sets to the starting scroll
    }

    public String getScroll(String choice) {// returns the chosen path scroll


        for (int i = 0; i < questScenes.scrollListSize(); i++) {//loops through scrolls list in Scene class

            if (questScenes.getScroll(i).getName().equals(choice)) {//uses input choice to finds correct scroll by name variable

                System.out.println("STARTcurrent scroll test " + currentScroll.getName());
                this.scroll = questScenes.getScroll(i).getPath();//sets return String to path that matches the input choice

                if (choice.equals("start")) {
                    currentScroll = questScenes.getScroll(0);//resets the game
                    this.scroll = currentScroll.getPath();

                } else if (currentScroll.getChoiceA().equals(choice)) {
                    currentScroll = questScenes.getScroll(i);
                    this.scroll = currentScroll.getPath();

                } else if (currentScroll.getChoiceB().equals(choice)) {
                    currentScroll = questScenes.getScroll(i);
                    this.scroll = currentScroll.getPath();

                } else if (currentScroll.getChoiceC().equals(choice)) {
                    currentScroll = questScenes.getScroll(i);
                    this.scroll = currentScroll.getPath();

                } else {
                    scroll = "<html><br> <br>Are you slow Adventurer? that is not a valid option, try again.<br>" + currentScroll.getPath();
                    //use random and a list to create replies when wrong text is entered
                }
            }
        }
        return scroll;
    }

    static class Scrolls {//scrolls contain the path choices and chosen path's storyline

        //private ArrayList<String> paths = new ArrayList<String>();
        private String choiceA, choiceB, choiceC, name;
        private String path = "";

        public Scrolls(String name, String choiceA, String choiceB, String choiceC) {
            this.choiceA = choiceA;
            this.choiceB = choiceB;
            this.choiceC = choiceC;
            this.name = name;
        }

        public void setChoices(String a, String b, String c) {
            choiceA = a;
            choiceB = b;
            choiceC = c;
        }

        public void setChoiceA(String choiceA) {
            this.choiceA = choiceA;
        }

        public void setChoiceB(String choiceB) {
            this.choiceB = choiceB;
        }

        public void setChoiceC(String choiceC) {
            this.choiceC = choiceC;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setPath(String path) {
            this.path = path;
            //addPath(path);
        }

        public void addPath(String p) {
            //  paths.add(p);
        }

        public String getChoiceA() {
            return choiceA;
        }

        public String getChoiceB() {
            return choiceB;
        }

        public String getChoiceC() {
            return choiceC;
        }

        public String getName() {
            return name;
        }

        public String getPath() {
            //return paths.get(0);
            return path;
        }

    }

}





