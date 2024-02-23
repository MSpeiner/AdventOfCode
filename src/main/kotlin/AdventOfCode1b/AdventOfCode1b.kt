package AdventOfCode1b

import AdventOfCode1a.inputData
import java.io.File

val data: List<String> = File("src/inputUppgiftEtt.txt").readLines()

fun main() {
    val intData: List<Int> = inputData.map { e -> e.toInt() }

    fun find2020(): Int {
        val noMatchFound =0;

        for (i in intData.indices) {
            for (j in i+1..<intData.size) {
                for (l in i+2..<intData.size)
                if (intData[i]+intData[j] + intData[l] == 2020)
                    return intData[i] * intData[j] * intData[l]
            }
        }
        return noMatchFound
    }
    println(find2020())
}