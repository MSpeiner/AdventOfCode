package AoCStrangersChoiceQuestionTwo2022
import java.io.File

// This is a strangers solution that I tried to rewrite to compare my solution to this solution
// Inspired by Reddit name:  kroppeb, Github link: https://github.com/Kroppeb/AdventOfCodeSolutions/blob/2020/solutions/src/solutions/y22/day%202.kt

val Url: String = "src/main/kotlin/input.txt"
val inputData: List<String> = File(Url).readLines()
val inputMap = inputData.map { it.split(" ") }


//metod för att ta fram slutresultat i del 1
fun strangersChoicePartOne(): Int {
    var totalPoints = inputMap.map { (a, x) ->
        when {
            a == "A" && x == "X" -> 3 + 1
            a == "A" && x == "Y" -> 6 + 2
            a == "A" && x == "Z" -> 0 + 3
            a == "B" && x == "X" -> 0 + 1
            a == "B" && x == "Y" -> 3 + 2
            a == "B" && x == "Z" -> 6 + 3
            a == "C" && x == "X" -> 6 + 1
            a == "C" && x == "Y" -> 0 + 2
            a == "C" && x == "Z" -> 3 + 3
            else -> error("$a to $x")
        }
    }.sum()
    return totalPoints
}

//Part 2

// Metod för att räkna ut summan av poäng generad från processLetters metoden
fun sumResult(lines: List<String>): Int {
    return lines.map { it.split(" ") }.map { processLetters(it[0], it[1]) }.sum()
}

//tar fram "poäng resultat" från dem två värden som skickas in och retunerar poängen från denna runda
fun processLetters(a: String, x: String): Int {
    return when {
        a == "A" && x == "X" -> 0 + 3
        a == "A" && x == "Y" -> 3 + 1
        a == "A" && x == "Z" -> 6 + 2
        a == "B" && x == "X" -> 0 + 1
        a == "B" && x == "Y" -> 3 + 2
        a == "B" && x == "Z" -> 6 + 3
        a == "C" && x == "X" -> 0 + 2
        a == "C" && x == "Y" -> 3 + 3
        a == "C" && x == "Z" -> 6 + 1
        else -> error("$a to $x")
    }
}


fun main() {

    //Resultat del 1
   val totalPointsPart1 = strangersChoicePartOne()
    println(totalPointsPart1)

    //Resultat del 2
    val resultPart2 = sumResult(inputData)
    println(resultPart2)
}
