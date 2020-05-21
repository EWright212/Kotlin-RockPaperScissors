class Game(private var player1: Player,private var player2: Player) {


    val listOfMoves: List<String> = listOf("Rock", "Paper", "Scissors")

    fun computerMove(randomMove: String): String {
        return randomMove
    }

    fun calculateWinner(): Any {
        if (player1.move == "Rock" && player2.move == "Scissors") {
            return player1
        } else {
            return player2
        }

    }

}
