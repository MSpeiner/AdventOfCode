package AdventOfCode1b2022
import java.io.File

val Url: String = "src/main/kotlin/input.txt"
val inputDataString: List<String> = File(Url).readLines()

//Solution for part 2 AdventOfCode
fun createListOfLists2(inputData: List<String>): Int {
    val inputList: MutableList<List<Int>> = mutableListOf()
    var currentBlock: MutableList<Int> = mutableListOf()
    inputData.forEach { line ->
        if (line.isNotBlank()) {
            currentBlock.add(line.toInt())
        } else if (currentBlock.isNotEmpty()) {
            inputList.add(currentBlock.toList())
            currentBlock.clear()
        }
    }
    if (currentBlock.isNotEmpty()) {
        inputList.add(currentBlock.toList())
    }
    val listOfSum: List<Int> = inputList.map { it.sum() }
    val largestSum = listOfSum.maxOfOrNull { it } ?: 0
    val secondLargestSum = listOfSum.sortedDescending().get(1)
    val thirdLargestSum = listOfSum.sortedDescending().get(2)
    return largestSum + secondLargestSum + thirdLargestSum
}
fun main() {
    //Part 2 solution AoC 1a 2022
    val totalOfThreeLargestSums = createListOfLists2(inputDataString)
    println(totalOfThreeLargestSums)

}