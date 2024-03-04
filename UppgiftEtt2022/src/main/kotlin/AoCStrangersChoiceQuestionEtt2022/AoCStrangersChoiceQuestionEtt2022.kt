package AoCStrangersChoiceQuestionEtt2022
import java.io.File

//Solution inspired by https://github.com/peckb1/advent-of-code/blob/main/src/main/kotlin/me/peckb/aoc/_2022/calendar/day01/Day01.kt

val Url: String = "src/main/kotlin/input.txt"
val inputDataString: List<String> = File(Url).readLines()
val summedCalories = 0

//Lösning för del 1
fun solution1(inputData: List<String>): Int {
    val totalCalories = inputData.map { it.toIntOrNull() }
    val listOfCalories = mutableListOf<Int>()
    var summedCalories = 0

    totalCalories.forEachIndexed { index, nextRowOfCalorie ->
        if (nextRowOfCalorie != null) {
            summedCalories += nextRowOfCalorie
        } else {
            listOfCalories.add(summedCalories)
            summedCalories = 0
        }
    }
    listOfCalories.add(summedCalories)
    //Retunerar det högsta värdet i listan
    return listOfCalories.maxOf { it }
}

//Lösning för del 2
fun solution2(inputData: List<String>): Int {
    val totalCalories = inputData.map { it.toIntOrNull() }
    val listOfCalories = mutableListOf(0)
    totalCalories.forEach { nextRowOfCalorie ->
        nextRowOfCalorie?.let {
            listOfCalories[listOfCalories.size - 1] += it
        } ?: listOfCalories.add(0)
    }
    return listOfCalories.apply { sortDescending() }.take(3).sum()
}

fun main() {
    //result 1
    println(solution1(inputDataString))

    //result 2
    println(solution2(inputDataString))
}
