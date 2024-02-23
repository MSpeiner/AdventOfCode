import java.io.File

val inputData: List<String> = File("src/inputUppgiftEtt.txt").readLines()

fun main() {
    val intData: List<Int> = inputData.map { e -> e.toInt() }

    fun find2020(): Int {
        var noMatchFound =0;
        for (i in intData.indices) {
            for (j in i+1 until intData.size) {
                if (intData[i]+intData[j] == 2020)
                    return intData[i] * intData[j]
            }
        }
        return noMatchFound
    }
    println(find2020())
}