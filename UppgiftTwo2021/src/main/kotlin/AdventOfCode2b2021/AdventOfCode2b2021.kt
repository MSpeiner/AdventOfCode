package AdventOfCode2b2021


import java.io.File

val Url: String = "src/main/kotlin/input.txt"
val inputData: List<String> = File(Url).readLines()

//Step 1
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

//Step2

//Method that takes out the result of Part 2 through going through the list and goes through the
fun createGroupsOfCommandsForPart2(listOfCommands: List<String>): Int {
    var aim = 0
    var horizontalPosition = 0
    var depthPosition = 0

    //Goes through the list, splits each row into command and value (radens int värde) then it runs the inner loop.
    //Ultimatly it updates aim, horizontalPosition och depthPosition values.
    listOfCommands.forEach { commandString ->
        val (command, valueStr) = commandString.split(" ")
        val value = valueStr.toInt()

        when (command) {
            "down" -> {
                aim += value
            }

            "up" -> {
                aim -= value
            }

            "forward" -> {
                horizontalPosition += value
                if (aim > 0) {
                    depthPosition += value * aim
                }
            }
        }
    }

    //returns horizontalPosition och depthPosition to give the asked for result
    return horizontalPosition * depthPosition
}

fun main() {
    //Part 1
    //Creates Map list
    val keyMappedInput = createGroupsOfCommands(inputData)
    //calculates answer
    val finalValues = findFinalDepth(keyMappedInput)
    //prints answer
    println(finalValues)

    //Part 2
    val part2Result = createGroupsOfCommandsForPart2(inputData)
    println(part2Result)
}