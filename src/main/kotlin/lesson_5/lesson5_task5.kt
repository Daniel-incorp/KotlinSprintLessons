package lesson_5

const val MIN_LUCKY_NUMBER = 0
const val MAX_LUCKY_NUMBER = 42
const val THREE_NUMBERS_WIN = 3
const val TWO_NUMBERS_WIN = 2
const val ONE_NUMBER_WINS = 1

fun main() {
    var userInput: Int
    val userListNumbers = mutableListOf<Int>()
    val luckyListNumbers = List(3) { (MIN_LUCKY_NUMBER..MAX_LUCKY_NUMBER).random() }

    repeat(3) {
        print("Введите число от 0 до 42: ")
        userInput = readln().toInt()
        userListNumbers.add(userInput)
    }

    val uniqueListGuessedNumbers = luckyListNumbers.intersect(userListNumbers)

    for (i in userListNumbers.indices) {
        if (userListNumbers[i] !in MIN_LUCKY_NUMBER..MAX_LUCKY_NUMBER)
            return println("Пожалуйста вводите числа от 0 до 42")
    }

    when (uniqueListGuessedNumbers.size) {
        THREE_NUMBERS_WIN -> println("Поздравляем, вы угадали все три числа и выиграли джекпот")
        TWO_NUMBERS_WIN -> println("Поздравляем, вы угадали два числа из трёх и выиграли крупный приз")
        ONE_NUMBER_WINS -> println("Поздравляем, вы угадали одно число из трёх и выиграли утешительный приз")
        else -> println("К сожалению вы не угадали ни одного числа")
    }
    println(luckyListNumbers)
}