package lesson_3

fun main() {
    val string = "D2-D4;0"
    val (startMove, endMove, counterMove) = string.split('-',';')

    println("Начало хода: $startMove\nКонец хода: $endMove\nСчётчик ходов: $counterMove")
}