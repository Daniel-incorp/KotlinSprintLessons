package lesson_4

const val IS_SUNNY_WEATHER = true
const val IS_TENT_OPEN = true
const val AIR_HUMIDITY = 20
const val UNFAVORABLE_SEASON = "Зима"

fun main() {
    val isSunnyWeatherToday = true
    val isTentOpen = true
    val airHumidity = 20
    val weatherSeason = "Зима"
    val goodConditions = (
            isSunnyWeatherToday == IS_SUNNY_WEATHER &&
            isTentOpen == IS_TENT_OPEN &&
            airHumidity == AIR_HUMIDITY &&
            weatherSeason != UNFAVORABLE_SEASON
    )

    println("Благоприятные ли условия сейчас для роста бобовых? $goodConditions")
}
