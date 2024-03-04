package AdventOfCode4a2022

import CreateRanges
import countSameNumbersContained
import finerInputData
import org.junit.jupiter.api.Assertions.*

class AdventOfCode4aKtTest {

    @org.junit.jupiter.api.Test
    fun testCreateRanges() {
        val testData = listOf(
            listOf(1, 5),
            listOf(10, 15),
            listOf(20, 25)
        )
        val expectedResult = listOf(
            Pair(1..5, 10..15),
            Pair(20..25, 20..25) // Second range defaults to first range
        )
        val actualResult = CreateRanges(testData)
        assertEquals(expectedResult, actualResult)
    }

    @org.junit.jupiter.api.Test
    fun testCountSameNumbersContained() {
        val expectedResult = 431
        val actualResult = countSameNumbersContained(CreateRanges(finerInputData))
        assertEquals(expectedResult, actualResult)
    }
}