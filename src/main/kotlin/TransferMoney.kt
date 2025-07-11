fun main() {

    val percentCommission: Double = 0.75
    val minCommission: Int = 35
//    amount сумма перевода
    val amount = 5000
//    расчет комиссии
    val commissionReturns = (amount / 100) * percentCommission
//    условия вывода комиссии и вывод в консоль
    if (commissionReturns < minCommission) {
        println("Комиссия составит: $minCommission")
    } else {
        println("Комиссия составит: $commissionReturns рублей")
    }
}