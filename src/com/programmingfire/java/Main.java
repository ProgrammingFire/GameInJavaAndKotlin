package com.programmingfire.java;

import org.jetbrains.annotations.NotNull;

import java.util.Scanner;

public class Main {
    public static void main(String @NotNull [] args) {
        var scanner = new Scanner(System.in);
        while (true) {
            Game game;
            try {
                game = new Game(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
            } catch (Error e) {
                game = new Game(1, 100);
            }
            game.play();
            System.out.print("Do You Want To Play Again (Y/N)? ");
            var wantToPlayAgain = scanner.next().equalsIgnoreCase("y");
            if (!wantToPlayAgain) {
                break;
            }
        }
    }
}