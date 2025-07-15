package lesson_3

fun main() {
    val string = "D2-D4;0"
//  Как будто так понятнее, без непонятных чисел, но чуть более загружено
//  val startMove_ = string.substringAfter('-').substringBefore(';')
//  val endMove_ = string.substringBefore('-')
    val startMove = string.substring(0..1)
    val endMove = string.substring(3..4)
    val counterMove = string.substringAfter(';')

    println("Начало хода: $startMove\nКонец хода: $endMove\nСчётчик ходов: $counterMove")
}