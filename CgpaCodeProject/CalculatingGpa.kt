package CgpaCodeProject

open class CalculatingGpa:TotalCgpaCalculating() {

    fun subjectCgpa(SubjectNumber:Int):String{
        if(SubjectNumber in 80..100) return "A+"
        else if(SubjectNumber in 75..79) return "A"
        else if(SubjectNumber in 70..74) return "A-"
        else if(SubjectNumber in 65..69) return "B+"
        else if(SubjectNumber in 60..64) return "B"
        else if(SubjectNumber in 55..59) return "C+"
        else if(SubjectNumber in 50..54) return "C"
        else if(SubjectNumber in 45..49) return "D+"
        else if(SubjectNumber in 35..44) return "D"
        else if(SubjectNumber in 0..34) return "Failed"
        else return "No Data fetched."
    }

    fun subjectGrading (SubjectNumber: Int):Double{
        if(subjectCgpa(SubjectNumber) == "A+"){
            return 4.0
        }
        else if(subjectCgpa(SubjectNumber) == "A"){
            return 3.75
        }
        else if(subjectCgpa(SubjectNumber) == "A-"){
            return 3.50
        }else if(subjectCgpa(SubjectNumber) == "B+"){
            return 3.25
        }else if(subjectCgpa(SubjectNumber) == "B"){
            return 3.0
        }else if(subjectCgpa(SubjectNumber) == "C+"){
            return 2.50
        }else if(subjectCgpa(SubjectNumber) == "C"){
            return 2.25
        }else if(subjectCgpa(SubjectNumber) == "D+"){
            return 2.00
        }else if(subjectCgpa(SubjectNumber) == "D"){
            return 1.7
        }else return 0.0
    }
}