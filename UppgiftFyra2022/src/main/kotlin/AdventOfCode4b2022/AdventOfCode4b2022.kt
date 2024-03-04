package AdventOfCode4b2022
import java.io.File

val Url: String = "src/main/kotlin/input.txt"
val inputData: List<String> = File(Url).readLines()
val fineInputData: List<String> = inputData.flatMap { e -> e.split(',') }
val finerInputData: List<List<Int>> = fineInputData.map { str -> str.split('-').map { it.toIntOrNull() ?: 0 } }

fun CreateRanges(intData: List<List<Int>>): List<Pair<IntRange, IntRange>> {
    val ranges = mutableListOf<Pair<IntRange, IntRange>>()
    for (i in 0 until intData.size step 2) {
        val firstList = intData[i]
        val secondList = if (i + 1 < intData.size) intData[i + 1] else listOf()
        val firstRange = IntRange(firstList[0], firstList[1])
        val secondRange = IntRange(secondList.getOrElse(0) { firstList[0] }, secondList.getOrElse(1) { firstList[1] })
        ranges.add(Pair(firstRange, secondRange))
    }
    return ranges
}


fun countSameNumbersContained(pairs: List<Pair<IntRange, IntRange>>): Int {
    var count = 0
    for ((firstRange, secondRange) in pairs) {
        if (firstRange.contains(secondRange.first) && firstRange.contains(secondRange.last) ||
            secondRange.contains(firstRange.first) && secondRange.contains(firstRange.last)
        ) {
            count++
        }
    }
    return count
}

//Metod som räknar antalet gånger for loopen som går igenom samtliga par i listan får tillbaka true från intersect is not empty.
//Detta är alltså antalet gånger ett par och ett annat par i listan har samma värden
fun countSameNumbersContained2(pairs: List<Pair<IntRange, IntRange>>): Int {
    var count = 0
    for ((firstRange, secondRange) in pairs) {
        if (firstRange.intersect(secondRange).isNotEmpty()) {
            count++
        }
    }
    return count
}

fun main() {
    //Result solution 1
    val ranges = CreateRanges(finerInputData)
    println(countSameNumbersContained(ranges))

    //Result solution 2
    val counter2 = countSameNumbersContained2(ranges)
    println(counter2)

}