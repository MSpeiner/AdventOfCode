package AdventOfCode1b2020

import AdventOfCode1b2022.*
import org.junit.Assert.assertEquals
import org.junit.Test


class AdventOfCode1b2020Test {
    //TDD For Part 2 of day 1 2020
    @Test
    fun testCreateListOfLists2() {
        val expectedResult = 200158
        val actualResult = createListOfLists2(inputDataString)
        assertEquals(expectedResult, actualResult)
    }
}