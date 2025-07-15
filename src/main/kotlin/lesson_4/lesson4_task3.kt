package lesson_4

const val SUNNY_WEATHER = true
const val OPENED_TENT = true
const val AIR_HUMIDITY = 20
const val WEATHER_TIME = "Не зима"

fun main() {
    val sunnyWeatherToday = true
    val openedTent = true
    val sunnyWeather = 20
    val weatherTime = "Зима"
    val goodCondition = (
            sunnyWeatherToday == SUNNY_WEATHER &&
            openedTent == OPENED_TENT &&
            sunnyWeather == AIR_HUMIDITY &&
            weatherTime == WEATHER_TIME
    )

    println("Благоприятные ли условия сейчас для роста бобовых? $goodCondition")
}
