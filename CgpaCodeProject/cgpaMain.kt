package CgpaCodeProject

fun main(args: Array<String>) {

    var cpgaProject=StudentInformation()
    println("Enter your name: ")
    var studentName= readLine().toString()
    println("Enter your ID: ")
    var studentId= readLine()!!.toInt()
    println("Enter your Semester: ")
    var semester= readLine()!!.toInt()
    StudentInformation.information(studentName,studentId,semester)
    val numberofEnrolled=StudentInformation.SubjectChoose

    val resultFetching=cgpaSubject()
    resultFetching.SubjectsCgpa(numberofEnrolled)


}