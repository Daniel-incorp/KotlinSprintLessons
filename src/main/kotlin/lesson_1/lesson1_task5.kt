package lesson_1

fun main() {
    val seconds = 6480
    val hoursInSpace = seconds / (60*60)
    val minutesInSpace = seconds / 60 - hoursInSpace * 60
//Всегда будет 0, т.к. всё делится нацело, если было бы, например, число 6481, то ответ был бы 1
    val secondsInSpace = seconds - hoursInSpace * 60 * 60 - minutesInSpace * 60
/*Можно сделать обработку до 24ч и динамически добавлять/убирать незначащий 0, но, как я предполагаю,
подобное будет далее, поэтому просто вставлю костыли:)*/

    println("\n0$hoursInSpace:$minutesInSpace:0$secondsInSpace")
}