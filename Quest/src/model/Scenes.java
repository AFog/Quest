package model;

import model.*;

import java.util.ArrayList;

/**
 * Created by Aaron Fogarty on 02/12/2014.
 */
public class Scenes {

    ArrayList<Quest.Scrolls> scrolls;

    public Scenes() {

        scrolls = new ArrayList<Quest.Scrolls>();


        Quest.Scrolls start = new Quest.Scrolls("start", "left", "right", "straight");
        start.setPath("<html>Welcome Adventurer, a wild Quest for fame and fortune awaits you...step forth if you dare." +
                "You awake in a Dungeon and find yourself alone with nothing but the rags on your back and a hard peice of bread in your pocket." +
                "You look around the Dungeon and see three passageways in front of you." +
                "The left passage is dark and a foul smelling, " +
                "the right passage is damp and slippery," +
                "and Straight-ahead is almost pitch black except for a very distant red glow<br>" +
                "Do you take the left passage?(Left)<br>" +
                "Do you take the right passage?(Right)<br>" +
                "Or do you go Straight-ahead?(Straight)");
        scrolls.add(start);


        Quest.Scrolls sceneA = new Quest.Scrolls("left", "go back", "fists", "bread");
        sceneA.setPath("<html>you boldly choose left,<br>You reach a door at the end  of the darkness. You can here grumbling through the door."
                + "You look through the keyhole and see a one armed decaying Goblin. "
                + "Do you want to go back the way you came or go through the door and fight the Goblin?"
                + "If you decide to fight the Goblin, you can attack with your fists or throw your rock hard bread at him<br>"
                + "Do you head back?(go back)<br>"
                + "Do you lunge forth at the goblin with your mighty fists?(fists)<br>"
                + "Do you attack the Goblin with your stale bread?(bread)");
        scrolls.add(sceneA);

        Quest.Scrolls sceneA1 = new Quest.Scrolls("go back", "left", "right", "straight");
        sceneA1.setPath("<html>you turn back towards the start of the tunnel,<br>You arrive back in the Dungeon you started in, in front of you are the three passageways."
                + "The left passage leads to the Goblin"
                + "The right passage is damp and slippery"
                + "And Straight-ahead is almost pitch black except for a very distant red glow"
                + "Do you take the left passage?(Left)"
                + "Do you take the right passage?(Right)"
                + "Or do you go straight-ahead?(Straight)");
        scrolls.add(sceneA1);

        Quest.Scrolls sceneA2 = new Quest.Scrolls("fists", "start", "end", "end");
        sceneA2.setPath("<html>You attack the Goblin with all your strength,<br>Looks like you've been punching above your weight, You are Dead. Your cock-sureness was no match for a half dead one-armed Goblin."
                + "He caught you with a beautiful right hook to the jaw, then ate your cadaver and bread. R.I.P"
                + "if you would like to play again type start");
        scrolls.add(sceneA2);

        Quest.Scrolls sceneA3 = new Quest.Scrolls("bread", "take", "door", "door");
        sceneA3.setPath("<html>You hurl the deadly bread at the Goblin,<br>The bread hits the Goblin right between the eyes and sends him into a daze."
                + "He trips and impails himself on his sword then crashes into the wall hitting a secret lever which opens a door to a room full of gold and treasures."
                + "You enter the chamber, the treasure is almost blinding, wall to wall, golden chalice's encrusted with gems,"
                + "chests full of platinum armour and weapons and sacks full of silver and diamonds. You cannot believe your luck."
                + "As you look around you notice there is another stone door at the back of the chamber"
                + "Do you fill your pockets and grab all the treasure you can carry?(take)"
                + "Do you head for the open door leaving the treasure room?(door)");
        scrolls.add(sceneA3);

        Quest.Scrolls sceneA4 = new Quest.Scrolls("take", "start", "end", "end");
        sceneA4.setPath("<html>you take everything in sight,<br>You have adorned yourself in the finest armor and filled your arms and pockets with the wealth of the chamber when you notice a single green gem sitting on a pedestal," +
                "the most beautiful gem your eyes have ever seen. With your only empty hand you grab the gem. Suddenly you hear a rumble, both doors begin to close." +
                "You try to run to a door but you are weighed down by all of your loot. Your greed has gotten the better of you, you die in the chamber trying to carry too much."
                + "if you would like to play again type start");
        scrolls.add(sceneA4);

        Quest.Scrolls sceneA5 = new Quest.Scrolls("door", "start", "end", "end");
        sceneA5.setPath("<html>You rush for the doorway,<br>Luckily you left the treasure. You barely make it through the doorway when you look back and see your peice of bread on the other side,"
                + "you hit the floor and reach through the closing wall and take your bread just before it closes down."
                + "You find yourself outside, its cold and raining, theres a forest in front of you. You can hear sounds of wild beasts and monsters in the forest."
                + "The Dungeon doesn't seem so bad now, but who needs treasure when you have a crusty peice of stale bread."
                + "<br>The Adventure will continue....soon");
        scrolls.add(sceneA5);

        Quest.Scrolls sceneB = new Quest.Scrolls("right", "body", "rat", "rat");
        sceneB.setPath("<html>You head down the right passage with caution,<br>You find yourself in the sewers. You see a body floating down a sewer tunnel and a rat swimming in the opposite direction."
                + "Do you follow the Body?(body)"
                + "Do you follow the Rat?(rat)");
        scrolls.add(sceneB);

        Quest.Scrolls sceneB1 = new Quest.Scrolls("body", "start", "end", "end");
        sceneB1.setPath("<html>You follow the floating bloated corpse,<br>You end up in a Swamp. It does not look good. Its a swamp filled with bodies."
                + "You see a figure sitting on a branch. 'You should not have come here', the low voice gargles."
                + "The Adventure will continue....soon"
                + "<br>if you would like to play again type start");
        scrolls.add(sceneB1);

        Quest.Scrolls sceneB2 = new Quest.Scrolls("rat", "west", "east", "east");
        sceneB2.setPath("<html>You follow the dirty rat,<br>You reach daylight. The sun beams down upon you and warms your pale skin. As your eyes adjust to the light you can see ahead."
                + "To the east a road and a forest to the west."
                + "<br>Do you take the forest path?(east)"
                + "<br>Or do you take the dirt road?(west)");
        scrolls.add(sceneB2);

        Quest.Scrolls sceneB3 = new Quest.Scrolls("west", "climb", "wish", "wish");
        sceneB3.setPath("<html>You ease on down the road..<br>You have been walking for some time now and light is fading."
                + "On the road you come to the top of a hill, on the otherside at the bottom you see a large rock."
                + "As you get closer you realise that it's not a rock, it is, in fact a Giant."
                + "You have gotten too close, the Giant stands up, his eyes have been sewn shut, he is blind."
                + "He smells you instantly and roars out 'Show yourself!'.."
                + "You shout up to the Giant that you are standing right in front of him."
                + "'You're lying, show yourself at once', he bellows. He begins stomping his feet and flailing his arms franticly in the direction of your voice."
                + "As you look around for a way to run, you begin to notice that all around are large rock shapes, you realise you are surrounded by Giants."
                + "you must think fast, if you dont stop the blind Giant from making so much noise he will wake every other Giant in the area."
                + "<br>Do you wish as hard as you can wish to be somewhere else?(wish)"
                + "<br>Do you attempt to climb up the Giants legs to his head and rip the stitches from his eyes, giving him sight?(climb)");
        scrolls.add(sceneB3);

        Quest.Scrolls sceneB4 = new Quest.Scrolls("forest", "continue", "bread", "bread");
        sceneB4.setPath("<html>You take a deep breath and head into the ancient forest,<br>You have been travelling through the forest for hours, you are tired and hungry."
                + "Night has come when you stumble upon a small stone tower. You find there are no doors into the tower as you walk around it."
                + "You look up and notice a light coming from the top window"
                + "Do you continue on through the forest?(continue)"
                + "Do you throw your bread at the window to see if there is someone inside?(throw)");
        scrolls.add(sceneB4);

        Quest.Scrolls sceneB5 = new Quest.Scrolls("climb", "start", "end", "end");
        sceneB5.setPath("<html>you begin your ascent of the Giant,<br>You climb up to the Giant's shoulders and grabbing hold of one ear you unknot the stitchted rope."
                + "Holding the rope you jump to the ground unraveling the seem."
                + "The Giant can see again and he sees you. Before you can speak he grabs you up from the ground and puts you in his breast pocket."
                + "You live out the rest of your days in the giants pocket feeding off the crumbs from his chin."
                + "What an Adventure!"
                + "<br>And it will continue....soon"
                + "Would you like to start again?(start)"
                + "Would you like to end?(end)"
                + "if you would like to play again type start");
        scrolls.add(sceneB5);

        Quest.Scrolls sceneB6 = new Quest.Scrolls("wish", "start", "end", "end");
        sceneB6.setPath("<html>You close your eyes and get on your knees and wish with all your might,<br>BANG!, CRASH!, SPLASH!......."
                + "Darkness"
                + "Well it was worth a shot, you think. The Giant must have squashed you with his boot"
                + "But wait, you open your eyes, your ALIVE! "
                + "It actually worked, you look around and find yourself floating in a swamp full of dead bodies,"
                + "you put your hand in your pockect.The bread is still there!"
                + "You see a figure sitting on a branch. 'You should not have come here', the low voice gargles."
                + "nThe Adventure will continue....soon"
                + "Would you like to start again?(start)"
                + "Would you like to end?(end)");
        scrolls.add(sceneB6);

        Quest.Scrolls sceneB7 = new Quest.Scrolls("east", "start", "end", "end");
        sceneB7.setPath("<html>You walk on,<br>You keep walking for a few hours but finally have to stop, you are too tired to go any further."
                + "You find shelter at the bottom of a hollowed out tree and you fall asleep."
                + "You are woken by the sound of footsteps, they sound like they are heading in your direction. It is still too dark to see anything further than a few feet."
                + "Closer and closer...."
                + "The Adventure will continue....soon");
        scrolls.add(sceneB7);

        Quest.Scrolls sceneB8 = new Quest.Scrolls("throw", "start", "end", "end");
        sceneB8.setPath("<html>You hit the window with your bread and catch it as it falls back down. You stand staring up at the window,"
                + "just as you are about to throw the bread again the light goes out."
                + "You step back and look around, you may have to move fast."
                + "As you look back up at the window it slowly begins to open, you hold you breath and prepare to run into the dark forest.."
                + "The Adventure will continue....soon");
        scrolls.add(sceneB8);


        Quest.Scrolls sceneC = new Quest.Scrolls("straight", "give", "keep", "keep");
        sceneC.setPath("<html>You venture straight into the darkness,<br>You come to a door. From underneath a red light pours. You open the door and enter."
                + "Inside you see a wizard slumped in the corner of the room, he looks old and frail."
                + "The room is dingy. The only light in the room comes from the top of his staff, a burning red glow. "
                + "It would seem he has been here a while and it smells like it too, in-fact your pretty sure the only thing he has been expelling recently is feces."
                + "You look around the room for a way out and notice there are two doors."
                + "'I want your bread, I will tell you which door is the right way forward for your piece of bread' the wizard wheezes."
                + "At this point either door looks good to you. What do you do?"
                + "Do you give him your crusty peice of bread?(give)"
                + "Do you hold onto your bread, you never know when you might need it?(keep)");
        scrolls.add(sceneC);

        Quest.Scrolls sceneC1 = new Quest.Scrolls("give", "walk", "dash", "dash");
        sceneC1.setPath("<html>you hand him your last piece of food.<br>He thanks you for the bread and points his dusty old finger towards the door that leads you forward."
                + "After some time you reach a broken bridge. The wood has rotted and what once was rope now looks like thread."
                + "The bridge may only have one crossing left in it."
                + "Do you slowly walk across the bridge navigating your way over using the stronger looking parts?(walk)"
                + "Or do you make a dash for the other side of the bridge?(dash)");
        scrolls.add(sceneC1);

        Quest.Scrolls sceneC2 = new Quest.Scrolls("keep", "start", "end", "end");
        sceneC2.setPath("<html>you tell him that you can't give him the bread because its not actually yours, your just minding it for a friend.<br>" +
                "He cast a spell on you turning you to stone and eats your bread. R.I.P" +
                "Would you like to start again?(start)");
        scrolls.add(sceneC2);


        Quest.Scrolls sceneC3 = new Quest.Scrolls("walk", "take", "door", "door");
        sceneC3.setPath("<html>Its a risky approach, but you start to make the small steps towards the otherside<br>You make it across. Just as you reach the other-side the bridge collapses with a thunderous splash into the water below."
                + "You count your blessings and move forward into the tunnels and Dungeons."
                + "You finally come to a room with a dead goblin hanging from a lever on the wall. You pull the lever and a wall opens,"
                + "through the doorway is a room full of gold and treasure."
                + "You enter the chamber, the treasure is almost blinding, wall to wall, golden chalaces incrusted with gems,"
                + "chests full of platimun armour and weapons and sacks full of silver and diomonds. You cannot believe your luck."
                + "As you look around you notice there is another stone door at the back of the chamber."
                + "Do you fill your pockets and grab all the treasure you can carry?(take)"
                + "Do you head for the open door leaving the treasure room?(door)");
        scrolls.add(sceneC3);

        Quest.Scrolls sceneC4 = new Quest.Scrolls("dash", "give", "keep", "keep");
        sceneC4.setPath("<html>The wildness erupts from inside you and you make the dash like a bat out of hell towards the otherside<br>"
                + "You have fallen into the Swamp below."
                + "BANG!, CRASH!, SPLASH!......."
                + "Darkness"
                + "You open your eyes and look around and find yourself floating in a swamp full of dead bodies."
                + "You see a figure sitting on a branch. 'You should not have come here', the low voice gargles."
                + "The Adventure will continue....soon");
        scrolls.add(sceneC4);

    }


    public Quest.Scrolls getScroll(int i) {
        return scrolls.get(i);
    }

    public int scrollListSize() {
        return scrolls.size();
    }


}
