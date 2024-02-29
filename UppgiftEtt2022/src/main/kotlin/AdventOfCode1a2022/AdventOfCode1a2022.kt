package AdventOfCode1a2022
import java.io.File

val Url: String = "src/main/kotlin/input.txt"
val inputDataString: List<String> = File(Url).readLines()

fun createListOfLists(inputData: List<String>): MutableList<List<Int>> {
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
    return inputList
}
fun main() {

    val listOfLists = createListOfLists(inputDataString)
    val listOfSum: List <Int> = listOfLists.map { it.sum()}
    val largest = listOfSum.maxOf {it}
    println(largest)

}