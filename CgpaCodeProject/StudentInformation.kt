package CgpaCodeProject

class StudentInformation:cgpaSubject() {
    init {
        println("Welcome to Cgpa Project.Add information to see your cgpa ")
    }

    companion object {
        private var studentName:String=""
        private var studentId:Int?=null
        private var semester:Int?=null
        var SubjectChoose:Int=0

        fun information(studentName:String,studentId:Int,semester:Int,){
            this.studentName=studentName
            this.studentId=studentId
            this.semester=semester
            println("""
                Name:               $studentName
                ID  :               $studentId
                Semester:           $semester
                EnrolledSubject:    ${enrolledSubject()}
            """.trimIndent())

        }

        fun enrolledSubject():Int{
           println("Enter the number of subjects you Enrolled? ")
            SubjectChoose= readLine()!!.toInt()
            return SubjectChoose
        }


    }

}