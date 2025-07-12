package lesson_2
const val ROUND = 60

fun main() {
    val routeTime = 457
    val routeHours = 9
    val routeMinutes = 39
    val arrivedMinutes = (routeTime + routeHours * ROUND + routeMinutes) % ROUND
    val arrivedHours =  (routeTime + routeHours * ROUND + routeMinutes) / ROUND

/*Ещё один вариант решения, более геморойный, но почему то он мне первый пришёл в голову...
где мы отдельно высчитываем часы в routeTime прибавляем их к routeHours, а оставшиеся минуты
прибавляем к routeMinutes, при чём нужно учитывать, если arrivedMinutes > 60 то в arrivedHours должно быть + 1
Результаты вычислений одинаковые - 17:16

    val arrivedMinutes = (routeTime % 60 + routeMinutes) % 60
    val arrivedHours = routeTime / 60 + routeHours + (routeTime % 60 + routeMinutes) / 60

*/

    println("\n$arrivedHours:$arrivedMinutes")
}