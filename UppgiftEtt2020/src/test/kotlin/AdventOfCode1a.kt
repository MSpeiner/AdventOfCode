package AdventOfCode1a2020

import org.junit.Assert.assertEquals
import org.junit.Test


class AdventOfCode1a2020Test {
    //TDD For Part 1 of day 1 2020
    @Test
    fun testfind2020mySolution() {
        val expectedResult = 538464
        val actualResult = find2020mySolution()
        assertEquals(expectedResult, actualResult)
    }
}

