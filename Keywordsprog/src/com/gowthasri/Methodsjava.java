package com.gowthasri;

public class Methodsjava {
    public static void main(String[] args) {
        calscore(true, 800, 5, 100);
        calscore(true, 900, 10, 100);
        int position=calculateHighScorePosition(1500);
        displayHighScorePosition("Sri", position);
        position=calculateHighScorePosition(900);
        displayHighScorePosition("ram", position);
        position=calculateHighScorePosition(1000);
        displayHighScorePosition("jim", position);
        position=calculateHighScorePosition(50);
        displayHighScorePosition("tom", position);

    }

    public static int calscore(boolean gameover, int score, int levelcompleted, int bonus) {
        if (gameover) {
            int finalscore = score + (levelcompleted * bonus);
            finalscore += 2000;
            System.out.println("your final score is " + finalscore);
            return finalscore;
        }
        return -1;
    }
    public static void displayHighScorePosition(String name, int position){
        System.out.println(name + " managed to get into position " + position + " on the high score table");
    }
    public static int calculateHighScorePosition(int player_Score){
        if(player_Score>=1000){
            return 1;
        }else if(player_Score>=500 && player_Score<1000){
            return 2;
        }else if (player_Score>=100 && player_Score<500){
            return 3;
        }else {
            return 4;
        }
    }
}
