package AdventOfCode2a2022

import org.junit.Test
import org.junit.jupiter.api.Assertions.*

class AdventOfCode2aKtTest {

    @Test
    fun testMapList() {
        val inputTest = listOf("A B", "C Z", "X Y")
        val expectedResult = listOf(1 to 2, 3 to 3, 1 to 2)
        val actualResult = mapList(inputTest)
        assertEquals(expectedResult,actualResult)
    }

    @Test
    fun testCalculateMyPoints() {
        val expectedResult = 8890
        val actualResult = calculateMyPoints(mapList(inputData))
        assertEquals(expectedResult,actualResult)
    }
}