fun main(){

    println("Welcome to 'ATM console based Application' project. ")
    println("Enter your PIN Code :[5 digit code] ")
    val Pincode = readLine()!!.toInt()

    println("Enter the pass/OTP code :[6 digit code] ")
    var passCode = readLine()!!.toInt()

    var loginInformation = logInDataPatch(Pincode,passCode)
    if(loginInformation){
        var userGettingSystem = primaryFile()
        userGettingSystem.option()
    }else{
        println("Data loadup failed.Try Again.")
    }
}

fun logInDataPatch(pinCode:Int, passCode:Int):Boolean{
    var loginSucess =false
    var dataStored = mutableMapOf(
        12001 to 123897,
        12002 to 785432,
        12003 to 765901,
        12004 to 909812,
        12005 to 674321,
        12006 to 556789
    )

    loginSucess =if(dataStored.keys.contains(pinCode)&& dataStored[pinCode]==passCode){
        println("Login Succesfully")
        true
    }else{
        println("Failed Login")
        false
    }
    return loginSucess
}