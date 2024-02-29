package AoCStrangersChoiceQuestionEtt2022
import java.io.File

//Solution inspired by https://github.com/peckb1/advent-of-code/blob/main/src/main/kotlin/me/peckb/aoc/_2022/calendar/day01/Day01.kt

val Url: String = "src/main/kotlin/input.txt"
val inputDataString: List<String> = File(Url).readLines()
val summedCalories = 0

fun main() {

//Skapar en lista som retunerar en Int lista med summerade värden av dem kalorier varje elv bär
    fun createListOfSummedCalories(calories: List<Int?>): MutableList<Int> {
        val listOfCalories = mutableListOf(summedCalories)
        calories.forEachIndexed { index, nextRowOfCalorie ->
            if (nextRowOfCalorie != null) {
                val lastRowOfCalire = listOfCalories.size - 1
                listOfCalories[lastRowOfCalire] = listOfCalories[lastRowOfCalire] + nextRowOfCalorie
            } else {
                listOfCalories.add(summedCalories)
            }
        }
        return listOfCalories
    }

    //Metod som tar fram högsta värdet i listan
    fun solution1(inputData: List<String>): Int {
        val totalCalories = inputData.map { it.toIntOrNull() }
        return createListOfSummedCalories(totalCalories).maxOf { it }
    }
    //Metod som tar fram dem tre hösta värdena i listan
    fun solution2(inputData: List<String>): Int {
        val totalCalories = inputData.map { it.toIntOrNull() }
        return createListOfSummedCalories(totalCalories).apply { sortDescending() }.take(3).sum()
    }

    //result 1
    val result1 = solution1(inputDataString)
    println(result1)

    //result 2
    val result2 = solution2(inputDataString)
    println(result2)
}
