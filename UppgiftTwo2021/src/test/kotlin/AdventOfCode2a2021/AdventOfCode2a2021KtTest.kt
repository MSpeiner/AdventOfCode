package AdventOfCode2a2021

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class AdventOfCode2a2021KtTest {

    @Test
    fun testCreateGroupsOfCommands() {
        val listOfCommands = listOf("down 5", "upp 3", "forward 7", "down 7", "forward 10")
        val expectedResult = mapOf("down" to 12, "upp" to 3, "forward" to 17)
        val result = createGroupsOfCommands(listOfCommands)
        assertEquals(expectedResult, result)
    }

    @Test
    fun testFindFinalDepth() {
        val expectedResult = 1727835
        val actualResult = AdventOfCode2b2021.findFinalDepth(createGroupsOfCommands(inputData))
        assertEquals(expectedResult, actualResult)
    }
}