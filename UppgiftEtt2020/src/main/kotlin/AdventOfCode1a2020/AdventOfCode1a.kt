package AdventOfCode1a2020

import java.io.File

val inputData: List<String> = File("src/inputUppgiftEtt.txt").readLines()
val intData: List<Int> = inputData.map { e -> e.toInt() }
val target: Int = 2020
val noMatchFound = 0;

//Min lösning Uppgift 1 del 1 2020
fun find2020mySolution(): Int {
    //Loopar igenom hela intData listans index
    for (i in intData.indices) {
        //Inre loop som loopar igenom alla tal efter index i för att kolla om index i * index J blir 2020
        for (j in i + 1 until intData.size) {
            if (intData[i] + intData[j] == target)
                return intData[i] * intData[j]
        }
    }
    return noMatchFound
}

fun main() {
    val result = find2020mySolution()
    if (result != noMatchFound)
        println(find2020mySolution())
    else
        println("No match found!")
}