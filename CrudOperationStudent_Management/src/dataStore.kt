class dataStore(sname:String,SId:Int,pDays:Int,Adays:Int,tPay:Double,Paid:Int,eligible:Boolean) {

    var sname = sname
    private set

    var pDays=pDays
        private set

    var Adays =Adays
    private set

    var tPay =tPay
    private set

    var Paid =Paid
    private set

    var eligible =eligible
    private set

    var SId =SId
    private set

    override fun toString(): String {
        return "Name:$sname S.Id:$SId P.days:$pDays A.days:$Adays T.Fee:$tPay P.Fee:$Paid applicable:$eligible"
    }

}