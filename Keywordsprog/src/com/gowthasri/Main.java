package com.gowthasri;

public class Main {

    public static void main(String[] args) {
	// if conditions
        boolean gameover=true;
        int score = 10000;
        int levelcompleted = 8;
        int bonus = 200;
        if(score==5000){
            System.out.println("you win the game");
        } else if (score<5000){
            System.out.println("didn't win");
        }else{
            System.out.println("you are here");
        }
//        if (gameover==true){
//            System.out.println("You are in this gameover loop");
//        }
        if (gameover == true){
            int finalscore= score+(levelcompleted*bonus);
            System.out.println("your final score is " + finalscore);
        }
    }
}
