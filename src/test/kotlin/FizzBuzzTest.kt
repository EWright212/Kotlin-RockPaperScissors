import org.junit.Assert.assertEquals
import org.junit.Test

class FizzBuzzTest {
    @Test
    fun one() {
        val fizzBuzz = FizzBuzz()
        val output = fizzBuzz.convertToFizzBuzz(1)
        assertEquals(1, output)
    }
}