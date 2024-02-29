package AdventOfCode2a2021

import java.io.File

val Url: String = "src/main/kotlin/input.txt"
val inputData: List<String> = File(Url).readLines()

//Method that creates a Map list containing 3 keys (forward, up, down) then sums the contained values of each key and returns
fun createGroupsOfCommands(listOfCommands: List<String>): Map<String, Int> {
    return listOfCommands.map {
        val (command, value) = it.split(" ")
        command to value.toInt()
    }.groupBy({ it.first }, { it.second }).mapValues { it.value.sum() }
}

//Method that does the calculation
fun findFinalDepth(mappedList: Map<String, Int>): Int {
    val downValue = mappedList["down"]?: 0
    val upValue = mappedList["up"]?: 0
    val forwardValue = mappedList["forward"]?: 0
    val finalDepth = downValue - upValue
    val totalValue = finalDepth * forwardValue

   return totalValue
    }


fun main() {
    //Creates Map list
    val keyMappedInput = createGroupsOfCommands(inputData)
    //calculates answer
    val finalValues = findFinalDepth(keyMappedInput)
    //prints answer
    println(finalValues)
}