package AoCStrangersChoiceQuestionOne2020

import org.junit.Assert
import org.junit.Test

class AdventOfCode1b2020Test {
    @Test
    fun testsearchFor2020() {
        val expectedResult1: Int = 1704
        val expectedResult2: Int = 316
        val actualResult1: Int = finalTwo[0]
        val actualResult2: Int = finalTwo[1]

        Assert.assertEquals(expectedResult1, actualResult1)
        Assert.assertEquals(expectedResult2, actualResult2)
    }
    @Test
    fun testsearchForThree2020() {
        val expectedResult1: Int = 1704
        val expectedResult2: Int = 316
        val expectedResult3: Int = 903
        val actualResult1: Int = finalTwo[0]
        val actualResult2: Int = finalTwo[1]
        val actualResult3: Int = finalThree[1]

        Assert.assertEquals(expectedResult1, actualResult1)
        Assert.assertEquals(expectedResult2, actualResult2)
        Assert.assertEquals(expectedResult3, actualResult3)
    }
}