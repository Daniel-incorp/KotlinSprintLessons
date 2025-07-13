package lesson_2

import kotlin.math.pow


const val TIMES_PER_YEAR = 12
const val THREE_ZEROS_AFTER_COMMA = 1000.0f

/*
Формула сложных процентов: A = P (1 + r/n)^(nt), где:
A - будущая стоимость (сумма с начисленными процентами),
P - начальная сумма (основной капитал),
r - годовая процентная ставка (в десятичном виде, например, 10% = 0,1),
n - количество начислений процентов в год (например, 12 для ежемесячного начисления),
t - количество лет.
*/

fun main() {
    val years = 20
    val clientFirstSum = 70_000
    val annualAmount =
        (16.7f / 100 * THREE_ZEROS_AFTER_COMMA).toInt() / THREE_ZEROS_AFTER_COMMA  //Потому что в конце float 0.16700001 единичка
    val divide =
        (annualAmount / TIMES_PER_YEAR * THREE_ZEROS_AFTER_COMMA).toInt() / THREE_ZEROS_AFTER_COMMA //А тут у нас 6 в периоде
    val powTo =
        ((1 + divide).pow(TIMES_PER_YEAR * years) * THREE_ZEROS_AFTER_COMMA).toInt() / THREE_ZEROS_AFTER_COMMA //Тут тоже не делится нацело
    val resultSum = clientFirstSum * powTo
//  Тридцать тысяч раз всё переписал, всё равно выходит какая-то шляпа, не понимаю...
    println("Размер вашего вклада через $years лет будет равен: %.3f рублей".format(resultSum))
}