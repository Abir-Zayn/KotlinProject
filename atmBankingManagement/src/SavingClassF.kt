class SavingClassF {
    var savingBalance = 0.0

    fun savingAccount() {
        savingBalance = 0.0
    }

    fun savingAccount(save: Double) {
        savingBalance = save
    }

    fun addbalance(money: Double): Double {
        savingBalance += money
        return savingBalance
    }

    @JvmName("getSavingBalance1")
    fun getSavingBalance(): Double {
        return savingBalance
    }

    fun cashout(money: Double) {
        val temp = savingBalance - 500
        if (money > savingBalance) {
            println("Not possible")
        } else if (temp < money) {
            println("you have to have at least 500 tk")
        } else {
            savingBalance = temp - money + 500
            println("You have cashed out$money")
        }
    }


}