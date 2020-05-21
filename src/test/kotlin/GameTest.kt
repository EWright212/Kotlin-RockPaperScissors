import org.junit.Assert.assertEquals
import org.junit.Test

class GameTest {
    @Test
    fun `computer move`() {
        val newGame = Game(Player(),Player())
        //Mock random move
        val output = newGame.computerMove(RandomMove())
        assertEquals("Rock", output)
    }

    private fun RandomMove(): String {
        return "Rock"
    }

}