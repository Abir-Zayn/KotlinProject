import java.util.*
import kotlin.system.exitProcess

fun main() {

    println("Here is the demo project named 'Love Project' which simulates the percentage of love you love a person")
    println("Enter the your name: ")
    var nameOfperson1 = readLine().toString().toUpperCase()
    println("Enter your lover name: ")
    var nameOfperson2 = readLine().toString().toUpperCase()

    if(nameOfperson1==nameOfperson2){
        println("Self love best.You love yourself more than 100%.")
        exitProcess(1)
    }


    val rand = Random()
    val lovePointsOF1 = rand.nextInt(50)
    val lovePointsOF2 =rand.nextInt(50)
    val totalLovePoints =lovePointsOF1+lovePointsOF2

    println("""
        $nameOfperson1 and $nameOfperson2 calculating your lovepoints
        $totalLovePoints .
    """.trimIndent())
        if(totalLovePoints<20){
            println("You at worst place.You guys need to get along together")
        }else if(totalLovePoints in 20..50){
            println("You are at average zone.You guys should spend sometime together.Go watch a movie. ")
        }else if(totalLovePoints in 51..75){
            println("You are in good zone.Keep supporting and trust each other")
        }else if(totalLovePoints in 76..100){
            println("You are in Perfect zone.Aww!! Made for each other")
        }

}