import kotlin.system.exitProcess

fun main() {
    var call=AddInfo()
    var database:MutableList<dataStore> = ArrayList()
    println("Welcome to 'Student Management via CrudOperation' project.")

    /*This project will demonstrate Student Exam eligible or not management System .Via this project we will see if a
    students present days,absent days,total tution fees, if he can sit in the exam or not .Determining by
    60% attentendence +40% tution fees. Lastly check if he is eligible or not
     */

    /*
    The semester counted as 6 months semester and consisting 2 days of holidays. The 100% present Days =183-
     */
    println("Enter the total holidays in semesters: ")
    var holidays = readLine()!!.toInt()

    println("Enter the semester duration[Numeric Form] The course either be 6 months or 4 months: ")
    var totalPDays:Int=0
    var presentDays:Int=0
    var absentDays:Int=0

    var semesterDuration = readLine()!!.toInt()
    if(semesterDuration==6 ||semesterDuration==4){
            if(semesterDuration==6){
                totalPDays = (183-holidays)-12
            }else if(semesterDuration==4){
                totalPDays =(121-holidays)-8
            }
    }else{
        call.failedData()
        exitProcess(1)
    }
    println("Total days in semester $totalPDays")


    println("complete the operation now")
    do {
        println("1.Insert")
        println("2.Display")
        println("3.SEARCH")
        println("4.UPDATE")
        println("Enter your choice")
        var choice = readLine()!!.toInt()

        when(choice){
            1->{
                println("Enter Student name: ")
                var sname= readLine()!!.toString()

                println("Enter Student ID: ")
                var studentId = readLine()!!.toInt()

                println("Number of days present in the class: ")
                presentDays= readLine()!!.toInt()

                if(presentDays>totalPDays){
                    //presentdays cant be higher than the total days in the semester.
                    call.failedData()
                }

                absentDays= totalPDays-presentDays
                println("Number of days absent in the class is $absentDays")
                var isEligible =call.attendenceCheck(presentDays,absentDays,totalPDays)
                println(isEligible)

                println("Number of course enrolled: ")

                var totalCreditHours=0.0
                var numberOfCourseEnrolled = readLine()!!.toInt()
                if(numberOfCourseEnrolled<=1 ||numberOfCourseEnrolled<=7){
                    println("Enter the credit hours: ")
                    repeat(numberOfCourseEnrolled){
                        var n= readLine()!!.toDouble()
                        totalCreditHours += n
                    }
                }else{
                    call.failedData()
                }
                var totalCost=totalCreditHours*2000 //perCredit cost 2000
                println("Amount of paid:")
                var amountPaid = readLine()!!.toInt()

                var eligibleCall=call.checkTutionFee(totalCost.toInt(),amountPaid)



                var finalcall=false
                if(isEligible==eligibleCall){
                    finalcall=isEligible
                }
                database.add(dataStore(sname,studentId,presentDays,absentDays,totalCost,amountPaid,finalcall))
            }
            2->{
                println("---------------------------------------------------------------")
                var i :Iterator<dataStore> =database.iterator()
                while(i.hasNext()){
                    val e=i.next()
                    println(e)
                }
                println("----------------------------------------------------------------")
            }
            3->{
                var found=false
                println("Enter the Student Id to search: ")
                var studentId = readLine()!!.toInt()
                var i :Iterator<dataStore> =database.iterator()
                while (i.hasNext()){
                    val e:dataStore =i.next()
                    if(e.SId==studentId){
                        println(e)
                        found =true
                    }
                }
                if(!found){
                    println("The data is'nt here")
                }
                println("---------------------------------------------------------------")
            }
            4->{
                var found=false
                println("Enter the Student Id to search before update: ")
                var studentId = readLine()!!.toInt()
               var i= database.listIterator()
                while (i.hasNext()) {
                    val e: dataStore = i.next()
                    if (e.SId == studentId) {


                        println("Enter the Student Name: ")
                        var studentName = readLine()!!.toString()

                        println("Eligible for exam in special consideration[True/False]:")
                        var askResult = readLine()!!.toBoolean()

                        println("Number of days present in the class: ")
                        presentDays = readLine()!!.toInt()

                        if (presentDays > totalPDays) {
                            //presentdays cant be higher than the total days in the semester.
                            call.failedData()
                        }

                        absentDays = totalPDays - presentDays
                        println("Number of days absent in the class is $absentDays")
                        var isEligible = call.attendenceCheck(presentDays, absentDays, totalPDays)
                        println(isEligible)

                        println("Number of course enrolled: ")

                        var totalCreditHours = 0.0
                        var numberOfCourseEnrolled = readLine()!!.toInt()
                        if (numberOfCourseEnrolled <= 1 || numberOfCourseEnrolled <= 7) {
                            println("Enter the credit hours: ")
                            repeat(numberOfCourseEnrolled) {
                                var n = readLine()!!.toDouble()
                                totalCreditHours += n
                            }
                        } else {
                            call.failedData()
                        }
                        var totalCost = totalCreditHours * 2000 //perCredit cost 2000
                        println("Amount of paid:")
                        var amountPaid = readLine()!!.toInt()

                        i.set(
                            dataStore(
                                studentName,
                                studentId,
                                presentDays,
                                absentDays,
                                totalCost,
                                amountPaid,
                                askResult
                            )
                        )
                        found = true
                    }
                }
                if(!found){
                    println("The item isnt existed here.")
                }else{
                    println("item updated Sucessfully")
                }
            }
        }

    }while (choice!=0)

}