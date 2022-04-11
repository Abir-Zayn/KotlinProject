import kotlin.system.exitProcess

fun main() {

    println("Welcome to 'Age Calculating'console based project.To get Started, Enter your name ")
     var userName = readLine()!!.toString()

    println("Enter your birthdate[YYYY] Year Format")
    var birthYear = readLine()!!.toInt()
    var countYear:Int=0
    var temp1=birthYear
    while(temp1!=0){
        temp1 /= 10;
        countYear++;

    }
    if(countYear<0 || countYear<=3)  wrongdataFetched()

    println("Enter your birthdate [DD]: ")
    var birthdate = readLine()!!.toInt()
    if(birthdate >31)      wrongdataFetched()

    println("Enter your birthdate [MM]: ")
    var birthMonth = readLine()!!.toInt()
    if(birthMonth>13) wrongdataFetched()

    var result =DataCollection()
    result.calculatingAnswer(birthYear,birthMonth,birthdate,userName)
}

fun wrongdataFetched(){
    println("You entered Wrong data")
    exitProcess(0)
}

