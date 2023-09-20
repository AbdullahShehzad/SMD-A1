// Base class Cricketer
interface Cricketer
{
    val name: String
    var age: Int
    val nationality: String
    fun print() {
        println("Name: $name, Age: $age, Nationality: $nationality")
    }
}

// Batsman class inherits from Cricketer
interface Batsman : Cricketer
{
    var score: Int
    var batsmanRanking : Int

    override fun print() {
        super.print()
        println("Score: $score, Batsman Ranking: $batsmanRanking")
    }

    fun getRanking(): Int {
        return batsmanRanking
    }
}

// Bowler class inherits from Cricketer
interface Bowler : Cricketer
{
    var wickets : Int
    var bowlerRanking : Int
    override fun print() {
        println("Wickets: $wickets, Bowler Ranking: $bowlerRanking")
    }

    fun getRanking(): Int {
        return bowlerRanking
    }
}

open class Allrounder(
    override val name: String,
    override var age: Int,
    override val nationality: String,
    override var score: Int,
    override var batsmanRanking: Int,
    override var wickets: Int,
    override var bowlerRanking: Int,

    private var ranking: Int = (batsmanRanking + bowlerRanking) / 2
) : Batsman, Bowler {

    override fun print() {
        super<Batsman>.print()
        super<Bowler>.print()
        println("Allrounder Ranking: $ranking")
    }

    override fun getRanking(): Int {
        return ranking
    }
}


fun main()
{
    val allrounder = Allrounder("Sam", 25, "Indian", 75, 4, 40, 2)
    allrounder.print()

}