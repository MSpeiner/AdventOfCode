package AdventOfCode2a2021

import java.io.File

val Url: String = "src/main/kotlin/input.txt"
val inputData: List<String> = File(Url).readLines()

val letterToValue: (Char) -> Int = { letter ->
    when (letter) {
        'A' -> 1
        'B' -> 2
        'C' -> 3
        'X' -> 1
        'Y' -> 2
        'Z' -> 3
        else -> 0
    }
}

fun mapList(inputData: List<String>): List<Pair<Int, Int>> {
    return inputData.map { pair ->
        val (firstVal, secondVal) = pair.split(" ")
        letterToValue(firstVal.first()) to letterToValue(secondVal.first())
    }
}

fun calculateMyPoints(calculatedData: List<Pair<Int, Int>>): Int {
    var myTotalPoints = 0
    calculatedData.forEach { (opponentVal, myVal) ->
        when {
            myVal == opponentVal -> myTotalPoints += 3 + myVal
            (myVal == 1 && opponentVal == 3) || (myVal == 2 && opponentVal == 1) || (myVal == 3 && opponentVal == 2) -> myTotalPoints += 6 + myVal
            else -> myTotalPoints += myVal
        }
    }
    return myTotalPoints
}

fun main() {
    val calculatedData = mapList(inputData)
    val calculatedTotalPoints = calculateMyPoints(calculatedData)

    println(calculatedTotalPoints)
}