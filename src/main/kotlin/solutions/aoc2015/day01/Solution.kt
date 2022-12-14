package solutions.aoc2015.day01

import utils.Resources


fun main() {

    val inputLine = Resources.getLine(2015, 1)
    println("part1 = " + part1(inputLine))
    println("part2 = " + part2(inputLine))
}

fun part1(input: String): Int {
    return input.fold(0) { acc, next -> if (next == '(') acc + 1 else acc - 1 }
}


fun part2(input: String): Int {
    return input.runningFold(0) { acc, next -> if (next == '(') acc + 1 else acc - 1 }
        .indexOfFirst { it == -1 }
}