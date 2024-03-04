package AdventOfCode2b2022

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

fun mapListString(inputData: List<String>): List<Pair<String, String>> {
    return inputData.map { pair ->
        val (firstVal, secondVal) = pair.split(" ")
        firstVal to secondVal
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

fun adjustRoads(inputList: List<Pair<String, String>>): List<Pair<Int, Int>> {
    return inputList.map { (opponentVal, myValue) ->
        val newMyValue = when (myValue) {
            "Z" -> when (opponentVal) {
                "A" -> "Y"
                "B" -> "Z"
                "C" -> "X"
                else -> myValue
            }

            "Y" -> when (opponentVal) {
                "A" -> "X"
                "B" -> "Y"
                "C" -> "Z"
                else -> myValue
            }

            "X" -> when (opponentVal) {
                "A" -> "Z"
                "B" -> "X"
                "C" -> "Y"
                else -> myValue
            }

            else -> myValue
        }

        val myVal = letterToValue(newMyValue.first())
        val opponentVal = letterToValue(opponentVal.first())

        opponentVal to myVal // Swapped myVal and opponentVal
    }
}

fun main() {

    //Result part one
    val calculatedData = mapList(inputData)
    val calculatedTotalPoints = calculateMyPoints(calculatedData)
    println(calculatedTotalPoints)

    //Result part two
    val stringMap = mapListString(inputData)
    val convertMapToIntPair = adjustRoads(stringMap)
    val newPointCounter = calculateMyPoints(convertMapToIntPair)
    println(newPointCounter)
}