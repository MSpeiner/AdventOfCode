package AoCStrangersChoiceQuestionTwo2021
import java.io.File

//This code has been inspired by Reddit name: soodssr, Github url to code: https://github.com/soodssr/aoc-2021-kotlin/blob/main/src/Day02.kt
//Solution was made to compare my code to how I could make it different.
val Url: String = "src/main/kotlin/input.txt"
val input: List<String> = File(Url).readLines()

//Solution for part 1
fun calculatePosition(input: List<String>) =
    input.fold(Pair(0,0)) { currentPosition, command ->
        val (cmd, value) = command.split(' ').let { Pair(it[0], it[1].toInt()) }
        val newPosition = when(cmd) {
            "forward" -> {
                val newPosition = Pair(currentPosition.first + value, currentPosition.second)
                newPosition
            }
            "down" -> {
                val newPosition = Pair(currentPosition.first, currentPosition.second + value)
                newPosition
            }
            "up" -> {
                val newPosition = Pair(currentPosition.first, currentPosition.second - value)
                newPosition
            }
            else -> currentPosition
        }
        newPosition
    }.let {
        it.first * it.second
    }

//Solution method for part 2
fun calculatePositionPartTwo(input: List<String>): Int {
    var x = 0
    var y = 0
    var z = 0

    for (command in input) {
        val (cmd, value) = command.split(' ')
        when (cmd) {
            "forward" -> {
                x += value.toInt()
                y += value.toInt() * z
            }
            "down" -> z += value.toInt()
            "up" -> z -= value.toInt()
        }
    }
    return x * y
}


fun main() {
    println(calculatePosition(input))
    println(calculatePositionPartTwo(input))
}