package lesson_1
const val ROUND = 60

fun main() {
    val seconds = 6480
    val hoursInSpace = seconds / (ROUND*ROUND)
    val minutesInSpace = seconds / ROUND % ROUND
//Всегда будет 0, т.к. всё делится нацело, если было бы, например, число 6481, то ответ был бы 1
    val secondsInSpace = seconds % ROUND
//Оказывается всё куда проще, а я изначально всю обработку незначащих нулей зафигачил в 3 условия when...

    println(String.format("\n%02d:%02d:%02d",
        hoursInSpace,
        minutesInSpace,
        secondsInSpace
    ))
}