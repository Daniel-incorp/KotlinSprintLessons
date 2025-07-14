package lesson_2

import kotlin.math.pow

/*
Формула сложных процентов: A = P * (1 + r)^n, где:
A - будущая стоимость (сумма с начисленными процентами),
P - начальная сумма (основной капитал),
r — годовая ставка,
n — количество лет.
*/

fun main() {
    val years = 20
    val clientFirstSum = 70000.0
    val percentage =  16.7
    val complexPercentage = clientFirstSum * (1 + percentage / 100).pow(years)

    println("Размер вашего вклада через $years лет будет равен: %.3f рублей".format(complexPercentage))
}