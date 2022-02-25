package CgpaCodeProject

open class TotalCgpaCalculating{

    fun totalCgpa(hoursOfcredit:Double,GainedCredits:Double):Double{
        return GainedCredits/hoursOfcredit
    }

    fun remarks(totalCgpaGrading:Double) :String{
        if(totalCgpaGrading==4.0){
            return "Exceptional"
        }
        else if(totalCgpaGrading in 3.70..3.99){
            return "Excellent"
        }else if(totalCgpaGrading in 3.30..3.69){
            return "Good"
        }else if(totalCgpaGrading in 2.70..3.29){
            return "Average"
        }else if(totalCgpaGrading in 2.0..2.69){
            return "Poor"
        }else if(totalCgpaGrading in 1.0..1.9){
            return "Not Regular"
        }else if(totalCgpaGrading in 0.0..0.9){
            return "Failed"
        } else return "Data Not Fecthed"
    }
}