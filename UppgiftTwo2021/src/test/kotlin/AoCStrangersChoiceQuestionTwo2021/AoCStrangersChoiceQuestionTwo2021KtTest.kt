package AoCStrangersChoiceQuestionTwo2021

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


class AoCStrangersChoiceQuestionTwo2021KtTest {

    @Test
    fun calculatePosition() {
        val expectedResult = 1727835
        val actualResult = calculatePosition(input)
        assertEquals(expectedResult, actualResult)
    }

    @Test
    fun calculatePositionPartTwo() {
        val expectedResult = 1544000595
        val actualResult = calculatePositionPartTwo(input)
        assertEquals(expectedResult, actualResult)
    }
}