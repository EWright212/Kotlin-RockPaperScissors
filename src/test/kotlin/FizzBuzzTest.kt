import org.junit.Assert.assertEquals
import org.junit.Test

class RockPaperScissorsGame {
    @Test
    fun `user input is stored`() {
        val newGame = RockPaperScissorsGame()
        val output = newGame.store(1)
        assertEquals(1, output)
    }
}