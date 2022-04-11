class primaryFile {
        private var call =SavingClassF()

    fun option(){
        var choice: Int = 0

        do{
            println("0.exit")
            println("1.Add Money")
            println("2.Check Balance")
            println("3.Cash Out")
            choice= readLine()!!.toInt()

            when(choice){
                1 -> {
                    println("Enter the amount of money: ")
                    val mon = readLine()!!.toDouble()
                    print("You have added: ")
                    call.addbalance(mon)
                }
                2->{
                    println("Your balance is now : "+call.savingBalance)
                }
                3->{
                    println("Amount of cashout")
                    val amount = readLine()!!.toDouble()
                    println("Your cash out amount is $amount")
                    call.cashout(amount)
                }
            }
        }while (choice!=0)
    }

}
