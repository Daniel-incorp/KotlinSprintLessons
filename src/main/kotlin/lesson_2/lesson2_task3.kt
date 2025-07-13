package lesson_2


const val MINUTES_IN_HOUR = 60

fun main() {
    val routeTime = 457
    val routeHours = 9
    val routeMinutes = 39
    val arrivedMinutes = (routeTime % MINUTES_IN_HOUR + routeMinutes) % MINUTES_IN_HOUR
    val arrivedHours = routeTime / MINUTES_IN_HOUR + routeHours + (routeTime % MINUTES_IN_HOUR + routeMinutes) / MINUTES_IN_HOUR

    println("Время прибытия поезда: %02d:%02d".format(arrivedHours, arrivedMinutes))
}