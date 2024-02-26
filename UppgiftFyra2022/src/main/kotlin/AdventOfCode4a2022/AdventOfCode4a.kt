import java.io.File

val Url: String = "src/main/kotlin/input.txt"
val inputData: List<String> = File(Url).readLines()
val fineInputData: List<String> = inputData.flatMap { e -> e.split(',') }
val finerInputData: List<List<Int>> = fineInputData.map { str -> str.split('-').map { it.toIntOrNull() ?: 0 } }

//Skapar en lista med intRange par
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

//Går igenom listan och jämnför parens värden med varandra för att se om första intRange innehåller första & sista värdet av den andra intRange
//Går även igenom tvärtom dvs om andra intRange innehåller första & sista värdet av den första intRange
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

fun main() {
    val ranges = CreateRanges(finerInputData)
    println(countSameNumbersContained(ranges))
}