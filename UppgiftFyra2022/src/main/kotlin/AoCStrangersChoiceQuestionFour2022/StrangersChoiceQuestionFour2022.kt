package AoCStrangersChoiceQuestionFour2022


//Solution inspired by Illustrious_Fortune7 on reddit
// https://www.reddit.com/r/adventofcode/comments/zc0zta/comment/iyuq2al/?utm_source=share&utm_medium=web3x&utm_name=web3xcss&utm_term=1&utm_content=share_button



import java.io.File
val Url: String = "src/main/kotlin/input.txt"
val input: List<String> = File(Url).readLines()


fun main() {

    //Läser in input och skapar en intlista som innehåller 4 värden ("2 int värden som symboliserar start och slut i ranges")
    //Jämfört med min egna kod där jag skapande där jag skapade lista med par av intRanges
    fun intList1(input: List<String>): List <List<Int>> {
        return input.map {
            it.split(",", "-").map { it.toInt() }
        }
    }

    //Här skapas en lista med en räknare som kontrollerar om det första värdet som då vore första värdet i första rangen finns i range av värde 3..4 vilket vore range 2
    // och sedan om andra värdet som vore sista värdet i "range 1" finns med i val 3..4 vilket vore range 2
    // sedan gör den samma sak fast tvärtom med värde 3&4 som ställs mot värde 1&2.
    // Om vilkoren stämmer retuneras true vilket då adderars i count som räknar true
    val count1 = intList1(input).count { (val1, val2, val3, val4) ->
        listOf(
            val1 in val3..val4 && val2 in val3..val4,
            val3 in val1..val2 && val4 in val1..val2
        ).let { (cond1, cond2) -> cond1 || cond2 }
    }

    val count2 = intList1(input).count { (first, second, third, fourth) ->
        listOf(
            first in third..fourth || second in third..fourth,
            third in first..second || fourth in first..second
        ).let { (cond1, cond2) -> cond1 || cond2 }
    }

    //Part 1 utskrift
    println(count1)
    //Part 2 utskrift
    println(count2)
}