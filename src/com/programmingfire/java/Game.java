package com.programmingfire.java;

import java.util.Random;
import java.util.Scanner;

public class Game {
    private final int randomNumber;
    private final Random random = new Random();
    private final Scanner scanner = new Scanner(System.in);
    private int guesses = 0;

    public Game() {
        randomNumber = random.nextInt(1, 100);
    }
    public Game(int origin, int bound) {
        randomNumber = random.nextInt(origin, bound);
    }

    public void play() {
        while (true) {
            var guess = takeInput();
            var isWon = decide(guess);
            if (isWon) {
                break;
            }
        }
    }

    private int takeInput() {
        System.out.print("Enter The Number: ");
        var guess = scanner.nextInt();
        guesses++;
        return guess;
    }

    private boolean decide(int guess) {
        if (guess == randomNumber) {
            System.out.println("You Won The Game In " + guesses + " Guesses!");
            return true;
        } else if (guess > randomNumber) {
            System.out.println("Your Number Is Larger Than The Random Number");
        } else {
            System.out.println("Your Number Is Smaller Than The Random Number");
        }

        return false;
    }
}
