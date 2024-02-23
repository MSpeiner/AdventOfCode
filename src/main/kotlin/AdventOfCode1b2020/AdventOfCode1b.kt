package AdventOfCode1b2020

import java.io.File

val data: List<String> = File("src/inputUppgiftEtt.txt").readLines()
val intData: List<Int> = data.map { e -> e.toInt() }
val noMatchFound =0;
val target: Int = 2020

fun main() {


    //Min lösning Uppgift 1 del 2 2020
    fun find2020MinLösning(): Int {

        //Loopar igenom hela intData listans index
        for (i in intData.indices) {
            //Innre loop som loppar igenom alla tal i listan efter Index I
            for (j in i+1..<intData.size) {
                //Innersta loopen som loopar igenom och kollar om index i,j och l tillsammans blir 2020
                for (l in i+2..<intData.size)
                if (intData[i]+intData[j] + intData[l] == target)
                    return intData[i] * intData[j] * intData[l]
            }
        }
        return noMatchFound
    }
    if (find2020MinLösning() != noMatchFound)
        println(find2020MinLösning())
    else
        println("No match found!")


}