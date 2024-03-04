package AdventOfCode4b2022

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class AdventOfCode4b2022KtTest {

    @Test
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

    @Test
    fun testCountSameNumbersContained() {
        val expectedResult = 431
        val actualResult = countSameNumbersContained(CreateRanges(finerInputData))
        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun countSameNumbersContained2() {
        val expectedResult = 823
        val actualResult = countSameNumbersContained2(CreateRanges(finerInputData))
        assertEquals(expectedResult, actualResult)
    }
}