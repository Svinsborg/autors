fun main() {
    println("Стоимость текущей продажи")
    var input = readLine()
    val amount = input!!.toInt()

    println("Ссмма предыдущих продаж")
    input = readLine()
    val total = input!!.toInt()

    println("VIP автор? Y/N")
    input = readLine()
    var vip:Boolean = false
    if ( input == "Y" || input== "y"){
        vip = true
    }

    val fee = calculateFee(amount, total, vip)

    println("Сервисный  сбор  составит: $fee")
    print  ("Итоговая  сумма к выплате: ")
    println(amount - fee)
}

fun calculateFee(amount:Int, total:Int, vip:Boolean): Int {

    var result = 0
    var tax = 0
    val discount = 5

    if (total >= 50_001) {
        tax = 15
        if (vip) tax -= discount
        result = (amount * tax / 100)


    } else if (total in 10_001..50_000) {
        tax = 20
        if (vip) tax -= discount
        result = (amount * tax / 100)

    } else if (total in 1001..10_000) {
        tax = 25
        if (vip) tax -= discount
        result = (amount * tax / 100)

    } else {
        tax = 30
        if (vip) tax -= discount
        result = (amount * tax / 100)
    }
    return (result)
}
