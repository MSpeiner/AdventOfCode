package AoCStrangersChoiceQuestionTwo2022

import org.testng.annotations.Test

import org.testng.Assert.*

class AdventOfCodeStrangersChoiceQuestionTwo2021KtTest {

    @Test
    fun testStrangersChoicePartOne() {
        val expectedResult = 8890
        val actualResult = strangersChoicePartOne()
        assertEquals(actualResult, expectedResult)
    }

    @Test
    fun testSumResult() {
        val expectedResult = 10238
        val actualResult = sumResult(inputData)
        assertEquals(actualResult, expectedResult)
    }

    @Test
    fun testProcessLetters() {
        var actualResult = processLetters("A", "Y")
        var expectedResult = 4
        assertEquals(actualResult, expectedResult)
    }
}