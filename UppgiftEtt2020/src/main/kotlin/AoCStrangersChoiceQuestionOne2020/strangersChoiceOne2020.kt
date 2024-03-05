package AoCStrangersChoiceQuestionOne2020

import java.io.File


//Inspererad lösning av _MiguelVargas_ (https://www.reddit.com/r/adventofcode/comments/k4e4lm/comment/gexfshn/?utm_source=share&utm_medium=web3x&utm_name=web3xcss&utm_term=1&utm_content=share_button)

val data: List<String> = File("src/inputUppgiftEtt.txt").readLines()
val intData: List<Int> = data.map { e -> e.toInt() }
val finalTwo = searchFor2020(2020)
val finalThree = searchForThree2020(2020)

//Filtrerar ut tal som tillsammans innehåller 2020 via metoden Contains, den retunerar en Array med dem tal som
// tillsammans blir måltalet
fun searchFor2020(goalNumber: Int) = intData.filter {focusNumber -> intData.contains(goalNumber - focusNumber)}


//Tar in ett målvärde som inparameter, sedan filtrerar man via att ta subtrahera varje siffra i listan med "målsiffran"
// och sedan kolla vilka 2 tal som tillsammans summerar till det kvarstående talet i detta fall [615, 903, 502]
fun searchForThree2020(goalNumber: Int) = intData.filter {focusNumber -> searchFor2020(goalNumber-focusNumber).isNotEmpty()}

fun main() {


    if (finalTwo.isEmpty()) {
        println("Finns inte två tal som adderar till målet")
    } else {
        println( finalTwo[0] * finalTwo[1])
    }

    if (finalThree.isEmpty()) {
        println("Finns inte tre tal som adderar till målet")
    } else {
        println( finalThree[0] * finalThree[1] * finalThree[2])
    }

}