class AddInfo {


    fun attendenceCheck(presentDays:Int,AbsentDays:Int,totalDays:Int):Boolean{
        var returnValue=false
        var percentage= totalDays*0.7
        if(presentDays >= percentage){
            returnValue=true
        }
        return returnValue
    }

    fun checkTutionFee(totalCost:Int,paid:Int):Boolean{
        var returnVal = false

        var payPercentage =totalCost*0.4
        if(paid >= payPercentage){
            returnVal=true
        }
        return returnVal
    }

    fun failedData(){
        println("You have entered wrong information.")
    }
}
