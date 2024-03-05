package AdventOfCode1b2020

import org.junit.Assert
import org.junit.Test

class AdventOfCode1b2020Test {
    @Test
    fun testfind2020MinLösning() {
        val expectedResult = 278783190
        val actualResult = find2020MinLösning()
        Assert.assertEquals(expectedResult, actualResult)
    }
}