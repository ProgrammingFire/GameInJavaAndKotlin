package com.programmingfire.kotlin

import java.util.*

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val scanner = Scanner(System.`in`)

        var origin = 1
        var bound = 100

        if (args.size == 2) {
            args[0].toInt().also { origin = it }
            args[1].toInt().also { bound = it }
        }

        while (true) {
            Game(origin, bound).also {
                it.play()
            }

            print("Do You Want To Play Again (Y/N)? ")
            val wantToPlayAgain = scanner.next().equals("y", ignoreCase = true)
            if (!wantToPlayAgain) {
                break
            }
        }
    }
}