class DataCollection
    () {
    private var currentYear:Int =2022

    var currentMonth:Int =4
        get() = field
        set(value) { field=value }

    var currentDate:Int =14
        get() =field
        set(value) { field =value }

    fun calculatingAnswer(bYear: Int, bMonth: Int, bDate: Int,userName:String) {
        var differenceYears = currentYear - bYear
        var differenceMonths = currentMonth - bMonth
        var differenceDate = currentDate - bDate

        val monthsDays= arrayOf(31,28,31,30,31,30,31,31,30,31,30,31)
        if(differenceDate<0){
            //differenceDate = monthsDays[bMonth-1]+differenceDate
            differenceDate += monthsDays[bMonth - 1]
            differenceDate -=1
        }
        if(differenceMonths<0){
            // differenceMonths =12+differenceMonths;
            differenceMonths += 12;
            differenceYears -=1
        }
        if(differenceYears<0){
            println("Wrong Information Entered")
        }else{
            //answer
            println("""
                    Hello,$userName Based on your Information
                    You born in [Year/Month/Date] : $bYear , $bMonth, $bDate
                    You are now  : $differenceYears years $differenceMonths months $differenceDate days. 
                """.trimIndent())
    }
    }
}