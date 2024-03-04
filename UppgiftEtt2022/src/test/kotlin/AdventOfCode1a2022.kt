package AdventOfCode1a2020

import AdventOfCode1a2022.*
import org.junit.Assert.assertEquals
import org.junit.Test


class AdventOfCode1a2020Test {
    //TDD For Part 1 of day 1 2020
    @Test
    fun testCreateListOfLists() {
        val expectedResult = 67658
        val actualResult = createListOfLists(AoCStrangersChoiceQuestionEtt2022.inputDataString)
        assertEquals(expectedResult, actualResult)
    }
}

