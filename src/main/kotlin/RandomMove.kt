class RandomMove(private val possibleMoves: List<String>) {

    fun main(): String {
        return possibleMoves.random()
    }


}