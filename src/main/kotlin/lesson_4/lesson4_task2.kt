package lesson_4

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val VOLUME = 100

fun main() {
    var weightOfLuggage = 20
    var volumeOfLuggage = 80
    var average = weightOfLuggage > MIN_WEIGHT && weightOfLuggage <= MAX_WEIGHT && volumeOfLuggage < VOLUME

    println("Груз с весом $weightOfLuggage кг и объемом $volumeOfLuggage л соответствует категории 'Average': $average")

    weightOfLuggage = 50
    volumeOfLuggage = 100
    average = weightOfLuggage > MIN_WEIGHT && weightOfLuggage <= MAX_WEIGHT && volumeOfLuggage < VOLUME

    println("Груз с весом $weightOfLuggage кг и объемом $volumeOfLuggage л соответствует категории 'Average': $average")
}