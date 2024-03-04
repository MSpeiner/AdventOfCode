package AdventOfCode1a2022
import java.io.File

val Url: String = "src/main/kotlin/input.txt"
val inputDataString: List<String> = File(Url).readLines()

//Solution for part 1 AdventOfCode day 1 2022
fun createListOfLists(inputData: List<String>): Int {
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

    val listOfSum: List <Int> = inputList.map { it.sum()}
    val largest = listOfSum.maxOf {it}

    return largest
}
fun main() {
    println(createListOfLists(inputDataString))

}