package lesson_4

const val MIN_NUMBER_OF_PEOPLE = 55
const val MAX_NUMBER_OF_PEOPLE = 70
const val MIN_NUMBER_OF_PROVISION_BOXES = 50

fun main() {
    val isNotDamaged = readln().toBoolean()
    val isGoodWeather = readln().toBoolean()
    val numberOfPeople = readln().toInt()
    val numberOfProvisionBoxes = readln().toInt()
    val alternativeDepartureOption = (
            !isNotDamaged &&
            isGoodWeather &&
            numberOfPeople == MAX_NUMBER_OF_PEOPLE &&
            numberOfProvisionBoxes >= MIN_NUMBER_OF_PROVISION_BOXES
    )

    println("Может ли корабль отправиться в плавание? ${
        (isNotDamaged && 
        (numberOfPeople in MIN_NUMBER_OF_PEOPLE..MAX_NUMBER_OF_PEOPLE) && 
        numberOfProvisionBoxes > MIN_NUMBER_OF_PROVISION_BOXES) ||
        alternativeDepartureOption
    }")
}