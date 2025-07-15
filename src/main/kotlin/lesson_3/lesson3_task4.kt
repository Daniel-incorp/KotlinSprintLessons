package lesson_3

fun main() {

    var startMove = "E2"
    var endMove = "E4"
    var counterMove = 1

    println("Ход чёрных: [$startMove-$endMove;$counterMove]")

    startMove = "D2"
    endMove = "D3"
    counterMove++

    println("Ход белых: [$startMove-$endMove;$counterMove]")
}