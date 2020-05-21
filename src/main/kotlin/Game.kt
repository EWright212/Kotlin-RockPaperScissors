class Game(private var player: Player,private var player1: Player) {


    val listOfMoves: List<String> = listOf("Rock", "Paper", "Scissors")

    fun computerMove(randomMove: String): String {
        return randomMove
    }

    fun calculateWinner(): Any {
        return player
    }

}
