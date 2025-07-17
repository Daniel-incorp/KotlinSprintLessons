package lesson_4

const val MIN_NUMBER_OF_PEOPLE = 55
const val MAX_NUMBER_OF_PEOPLE = 70
const val MIN_NUMBER_OF_PROVISION_BOXES = 50

fun main() {
    print("Корабль имеет повреждения? ")
    val isDamaged = readln().toBoolean()

    print("Сейчас благоприятная погода? ")
    val isGoodWeather = readln().toBoolean()

    print("Число экипажа на борту составляет: ")
    val numberOfPeople = readln().toInt()

    print("Число ящиков на борту с провизией составляет: ")
    val numberOfProvisionBoxes = readln().toInt()
    val alternativeDepartureOption =
            isDamaged &&
            isGoodWeather &&
            numberOfPeople == MAX_NUMBER_OF_PEOPLE &&
            numberOfProvisionBoxes >= MIN_NUMBER_OF_PROVISION_BOXES
    val mainDepartureOption =
            !isDamaged &&
            numberOfPeople in MIN_NUMBER_OF_PEOPLE..MAX_NUMBER_OF_PEOPLE &&
            numberOfProvisionBoxes > MIN_NUMBER_OF_PROVISION_BOXES

    println("\nМожет ли корабль отправиться в плавание? ${mainDepartureOption || alternativeDepartureOption}")
}