package PRACTICE;

import java.util.*;

class Guesser {
    int guessNum;

    int gusserNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guesser please enter the number between 1 to 10 : ");
        guessNum = sc.nextInt();
        return guessNum;
    }
}

class Player {
    int playerGuessNum;
    Scanner sc = new Scanner(System.in);

    int playerGuessNumber() {
        System.out.println("Player please guess the number : ");
        playerGuessNum = sc.nextInt();

        return playerGuessNum;
    }
}

class Umpire {
    int getNumFromGuesser;
    int getNumFromPlayer1;
    int getNumFromPlayer2;
    int getNumFromPlayer3;

    void collectNumFromGuesser() {
        Guesser g = new Guesser();
        getNumFromGuesser = g.gusserNumber();
    }

    void collectNumFromPlayer() {
        Player p1 = new Player();
        Player p2 = new Player();
        Player p3 = new Player();

        getNumFromPlayer1 = p1.playerGuessNumber();
        getNumFromPlayer2 = p2.playerGuessNumber();
        getNumFromPlayer3 = p3.playerGuessNumber();
    }

    void compare() {
        if (getNumFromGuesser == getNumFromPlayer1) {
            System.out.println("Player 1 has won the game");
        } else if (getNumFromGuesser == getNumFromPlayer2) {
            System.out.println("Player 2 has won the game");
        } else if (getNumFromGuesser == getNumFromPlayer3) {
            System.out.println("Player 3 has won the game");
        } else {
            System.out.println("All players have lost the game");
        }
    }

}

public class guesserGame {
    public static void main(String[] args) {

        Umpire u = new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayer();
        u.compare();

    }
}