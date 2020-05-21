class RandomMove(private val possibleMoves: List<String>) {

    fun main(): String {
        return possibleMoves.random()
    }


}

val list = mutableListOf("Rock", "Paper", "Scissors")
val random = RandomMove(list).main()
println(random)