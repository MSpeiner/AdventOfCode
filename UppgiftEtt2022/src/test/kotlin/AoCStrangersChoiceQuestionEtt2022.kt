package AoCStrangersChoiceQuestionEtt2022

import org.junit.Assert.assertEquals
import org.junit.Test


class AoCStrangersChoiceQuestionEtt2022Test {
    //TDD For Part 1 of day 1 2020
    @Test
    fun testSolution1() {
        val expectedResult = 67658
        val actualResult = solution1(inputDataString)
        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun testSolution2() {
        val expectedResult = 200158
        val actualResult = solution2(inputDataString)
        assertEquals(expectedResult, actualResult)
    }
}