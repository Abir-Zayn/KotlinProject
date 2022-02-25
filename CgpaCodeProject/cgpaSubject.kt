package CgpaCodeProject

open class cgpaSubject: CalculatingGpa(){

    fun SubjectName(n:Int){
        println("Enter the Subject name: ")
        val subjectName= readLine().toString()
        println("Enter numbers achieved in subject:")
        val subjectScore= readLine()!!.toInt()
        println("Enter Credit hours: ")
        val CreditHours= readLine()!!.toDouble()
        val tempTotalCredits=subjectGrading(subjectScore)*CreditHours

        println("SubjectName ----- SubjectScore ------- Grade -------- Credit Hours")
        println("""
            $subjectName       ${subjectCgpa(subjectScore)}     ${subjectGrading(subjectScore)}    $CreditHours
            ------------------------------------------------------------------------------------------------------------------------
            Cgpa is ${(totalCgpa(CreditHours,tempTotalCredits))}
            remarks ${remarks(totalCgpa(CreditHours,tempTotalCredits))}
        """.trimIndent())
    }

    fun SubjectNameForTwo() {
        println("Enter the Subjects name: ")
        var subjectName = readLine().toString()
        var subjectName2 = readLine().toString()
        println("Enter numbers achieved in subject:")
        var subjectScore = readLine()!!.toInt()
        var subjectScore2 = readLine()!!.toInt()
        println("Enter Credit Hours: ")
        val CreditHours= readLine()!!.toDouble()
        val CreditHours2= readLine()!!.toDouble()
        val TotalCreditHours=CreditHours+CreditHours2
        val tempTotalCredits=subjectGrading(subjectScore)*TotalCreditHours

        println("SubjectName   -----        SubjectScore           -------         Grade                    --------    Credit Hours")
        println(
            """
            $subjectName    ${subjectCgpa(subjectScore)}   ${subjectGrading(subjectScore)}    $CreditHours
            $subjectName2   ${subjectCgpa(subjectScore2)}  ${subjectGrading(subjectScore2)}   $CreditHours2
            ------------------------------------------------------------------------------------------------------------------------
            Cgpa is ${(totalCgpa(TotalCreditHours,tempTotalCredits))}
            remarks ${remarks(totalCgpa(TotalCreditHours,tempTotalCredits))}
        """.trimIndent())
    }

    fun SubjectNameForThree() {
        println("Enter the Subjects name: ")
        val subjectName = readLine().toString()
        val subjectName2 = readLine().toString()
        val subjectName3 = readLine().toString()

        println("Enter numbers achieved in subject:")
        val subjectScore = readLine()!!.toInt()
        val subjectScore2 = readLine()!!.toInt()
        val subjectScore3 = readLine()!!.toInt()

        println("Enter Credit Hours: ")
        val CreditHours= readLine()!!.toDouble()
        val CreditHours2= readLine()!!.toDouble()
        val CreditHours3= readLine()!!.toDouble()
        val TotalCreditHours=CreditHours+CreditHours2+CreditHours3
        val tempTotalCredits=subjectGrading(subjectScore)*TotalCreditHours

        println("SubjectName   -----        SubjectScore           -------         Grade                    --------    Credit Hours")
        println(
            """
            $subjectName     ${subjectCgpa(subjectScore)}    ${subjectGrading(subjectScore)}     $CreditHours
            $subjectName2    ${subjectCgpa(subjectScore2)}   ${subjectGrading(subjectScore2)}    $CreditHours2
            $subjectName3    ${subjectCgpa(subjectScore3)}   ${subjectGrading(subjectScore3)}    $CreditHours3
            -------------------------------------------------------------------------------------------------------
            Cgpa is ${(totalCgpa(TotalCreditHours, tempTotalCredits))}
            remarks ${remarks(totalCgpa(TotalCreditHours,tempTotalCredits))}
        """.trimIndent())
    }

    fun SubjectNameForFour() {
        println("Enter the Subjects name: ")
        val subjectName = readLine().toString()
        val subjectName2 = readLine().toString()
        val subjectName3 = readLine().toString()
        val subjectName4 = readLine().toString()

        println("Enter numbers achieved in subject:")
        val subjectScore = readLine()!!.toInt()
        val subjectScore2 = readLine()!!.toInt()
        val subjectScore3 = readLine()!!.toInt()
        val subjectScore4 = readLine()!!.toInt()

        println("Enter Credit Hours: ")
        val CreditHours= readLine()!!.toDouble()
        val CreditHours2= readLine()!!.toDouble()
        val CreditHours3= readLine()!!.toDouble()
        val CreditHours4= readLine()!!.toDouble()
        val TotalCreditHours=CreditHours+CreditHours2+CreditHours3+CreditHours4
        val tempTotalCredits=subjectGrading(subjectScore)*TotalCreditHours

        println("SubjectName   -----        SubjectScore           -------         Grade                    --------    Credit Hours")
        println(
            """
            $subjectName      ${subjectCgpa(subjectScore)}     ${subjectGrading(subjectScore)}      $CreditHours
            $subjectName2     ${subjectCgpa(subjectScore2)}    ${subjectGrading(subjectScore2)}     $CreditHours2
            $subjectName3     ${subjectCgpa(subjectScore3)}    ${subjectGrading(subjectScore3)}     $CreditHours3
            $subjectName4     ${subjectCgpa(subjectScore4)}    ${subjectGrading(subjectScore4)}     $CreditHours4
            -------------------------------------------------------------------------------------------------------
            Cgpa is     ${(totalCgpa(TotalCreditHours, tempTotalCredits))}
            remarks     ${remarks(totalCgpa(TotalCreditHours,tempTotalCredits))}
        """.trimIndent())
    }

    fun SubjectNameForFive() {
        println("Enter the Subjects name: ")
        val subjectName = readLine().toString()
        val subjectName2 = readLine().toString()
        val subjectName3 = readLine().toString()
        val subjectName4 = readLine().toString()
        val subjectName5 = readLine().toString()

        println("Enter numbers achieved in subject:")
        val subjectScore = readLine()!!.toInt()
        val subjectScore2 = readLine()!!.toInt()
        val subjectScore3 = readLine()!!.toInt()
        val subjectScore4 = readLine()!!.toInt()
        val subjectScore5 = readLine()!!.toInt()

        println("Enter Credit Hours: ")
        val CreditHours= readLine()!!.toDouble()
        val CreditHours2= readLine()!!.toDouble()
        val CreditHours3= readLine()!!.toDouble()
        val CreditHours4= readLine()!!.toDouble()
        val CreditHours5= readLine()!!.toDouble()
        val TotalCreditHours=CreditHours+CreditHours2+CreditHours3+CreditHours4+CreditHours5
        val tempTotalCredits=subjectGrading(subjectScore)*TotalCreditHours


        println("SubjectName   -----        SubjectScore           -------         Grade                    --------    Credit Hours")
        println(
            """
            $subjectName     ${subjectCgpa(subjectScore)}    ${subjectGrading(subjectScore)}     $CreditHours
            $subjectName2    ${subjectCgpa(subjectScore2)}   ${subjectGrading(subjectScore2)}    $CreditHours2
            $subjectName3    ${subjectCgpa(subjectScore3)}   ${subjectGrading(subjectScore3)}    $CreditHours3
            $subjectName4    ${subjectCgpa(subjectScore4)}   ${subjectGrading(subjectScore4)}    $CreditHours4
            $subjectName5    ${subjectCgpa(subjectScore5)}   ${subjectGrading(subjectScore5)}    $CreditHours5
            -------------------------------------------------------------------------------------------------------
            Cgpa is    ${(totalCgpa(TotalCreditHours, tempTotalCredits))}
            remarks    ${remarks(totalCgpa(TotalCreditHours,tempTotalCredits))}
        """.trimIndent())
    }

    fun SubjectNameForSix() {
        println("Enter the Subjects name: ")
        val subjectName = readLine().toString()
        val subjectName2 = readLine().toString()
        val subjectName3 = readLine().toString()
        val subjectName4 = readLine().toString()
        val subjectName5 = readLine().toString()
        val subjectName6 = readLine().toString()

        println("Enter numbers achieved in subject:")
        val subjectScore = readLine()!!.toInt()
        val subjectScore2 = readLine()!!.toInt()
        val subjectScore3 = readLine()!!.toInt()
        val subjectScore4 = readLine()!!.toInt()
        val subjectScore5 = readLine()!!.toInt()
        val subjectScore6= readLine()!!.toInt()

        println("Enter Credit Hours: ")
        val CreditHours= readLine()!!.toDouble()
        val CreditHours2= readLine()!!.toDouble()
        val CreditHours3= readLine()!!.toDouble()
        val CreditHours4= readLine()!!.toDouble()
        val CreditHours5= readLine()!!.toDouble()
        val CreditHours6= readLine()!!.toDouble()
        val TotalCreditHours=CreditHours+CreditHours2+CreditHours3+CreditHours4+CreditHours5+CreditHours6
        val tempTotalCredits=subjectGrading(subjectScore)*TotalCreditHours

        println("SubjectName   -----        SubjectScore           -------         Grade                    --------    Credit Hours")
        println(
            """
            $subjectName      ${subjectCgpa(subjectScore)}      ${subjectGrading(subjectScore)}       $CreditHours
            $subjectName2     ${subjectCgpa(subjectScore2)}     ${subjectGrading(subjectScore2)}      $CreditHours2
            $subjectName3     ${subjectCgpa(subjectScore3)}     ${subjectGrading(subjectScore3)}      $CreditHours3
            $subjectName4     ${subjectCgpa(subjectScore4)}     ${subjectGrading(subjectScore4)}      $CreditHours4
            $subjectName5     ${subjectCgpa(subjectScore5)}     ${subjectGrading(subjectScore5)}      $CreditHours5
            $subjectName6     ${subjectCgpa(subjectScore6)}     ${subjectGrading(subjectScore6)}      $CreditHours6
            -------------------------------------------------------------------------------------------------------
            Cgpa is ${(totalCgpa(TotalCreditHours, tempTotalCredits))}
            remarks ${remarks(totalCgpa(TotalCreditHours,tempTotalCredits))}
        """.trimIndent())

    }


    fun SubjectsCgpa(NoSub:Int) {
        if(NoSub==1){
            SubjectName(1)
        }
        else if(NoSub==2){
            SubjectNameForTwo()
        }
        else if(NoSub==3){
            SubjectNameForThree()
        }
        else if(NoSub==4){
            SubjectNameForFour()
        }
        else if(NoSub==5){
            SubjectNameForFive()
        }else if(NoSub==6){
            SubjectNameForSix()
        }else{
            println("You cant enroll more than 6 and less than 1 course")
        }
    }



}