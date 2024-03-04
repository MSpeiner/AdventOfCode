package AoCStrangersChoiceQuestionFour2022

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class StrangersChoiceQuestionFour2022KtTest {

    @Test
    fun testIntList() {
        val input = listOf("1,2,3", "4-5-6", "7,8,9")
        val expectedResult = listOf(listOf(1, 2, 3), listOf(4, 5, 6), listOf(7, 8, 9))
        val actualResult = intList(input)
        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun testCount1() {
        val expectedResult = 431
        val actualResult = Count1(input)
        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun testCount2() {
        val expectedResult = 823
        val actualResult = Count2(input)
        assertEquals(expectedResult, actualResult)
    }
}