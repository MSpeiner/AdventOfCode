package AdventOfCode2b2022

import org.testng.annotations.Test

import org.testng.Assert.*

class AdventOfCode2bKtTest {
    @Test
    fun testMapListString() {
        val inputData = listOf("A B", "C D", "E F")
        val expectedResult = listOf("A" to "B", "C" to "D", "E" to "F")
        val actualResult = mapListString(inputData)
        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun testMapList() {
        val inputTest = listOf("A B", "C Z", "X Y")
        val expectedResult = listOf(1 to 2, 3 to 3, 1 to 2)
        val actualResult = mapList(inputTest)
        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun testCalculateMyPoints() {
        val expectedResult = 8890
        val actualResult = calculateMyPoints(mapList(inputData))
        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun testAdjustRoads() {
        val inputList = listOf("A" to "X", "C" to "Y", "B" to "X")
        val expectedResult = listOf(1 to 3, 3 to 3, 2 to 1)
        val result = adjustRoads(inputList)
        assertEquals(result, expectedResult)
    }
}