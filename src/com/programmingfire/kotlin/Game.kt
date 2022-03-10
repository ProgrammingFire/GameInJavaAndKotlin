package com.programmingfire.kotlin

import java.util.*

class Game {
    private val randomNumber: Int
    private val random = Random()
    private val scanner = Scanner(System.`in`)
    private var guesses: Int = 0

    constructor() {
        randomNumber = random.nextInt(1, 100)
    }

    constructor(origin: Int, bound: Int) {
        randomNumber = random.nextInt(origin, bound)
    }

    fun play() {
        while (true) {
            val guess = takeInput()
            val isWon = decide(guess)
            if (isWon) {
                break
            }
        }
    }

    private fun takeInput(): Int {
        print("Enter The Number: ")
        val guess = scanner.nextInt()
        guesses++
        return guess
    }

    private fun decide(guess: Int): Boolean {
        if (guess == randomNumber) {
            println("You Won The Game In $guesses Guesses!")
            return true
        } else if (guess > randomNumber) {
            println("Your Number Is Larger Than The Random Number")
        } else {
            println("Your Number Is Smaller Than The Random Number")
        }
        return false
    }
}