package lesson_5

const val MIN_LUCKY_NUMBER = 0
const val MAX_LUCKY_NUMBER = 42
const val THREE_NUMBERS_WIN = 3
const val TWO_NUMBERS_WIN = 2
const val ONE_NUMBER_WINS = 1

fun main() {
    val userListNumbers = mutableListOf<Int>()
    val luckyListNumbers = mutableListOf<Int>()
    val firstLuckyNumber = (MIN_LUCKY_NUMBER..MAX_LUCKY_NUMBER).random()
    val secondLuckyNumber = (MIN_LUCKY_NUMBER..MAX_LUCKY_NUMBER).random()
    val thirdLuckyNumber = (MIN_LUCKY_NUMBER..MAX_LUCKY_NUMBER).random()

    luckyListNumbers.add(firstLuckyNumber)
    luckyListNumbers.add(secondLuckyNumber)
    luckyListNumbers.add(thirdLuckyNumber)
//    println(luckyListNumbers)

    print("Введите первое число от 0 до 42: ")
    val firstUserInput = readln().toInt()

    print("Введите второе число от 0 до 42: ")
    val secondUserInput = readln().toInt()

    print("Введите третье число от 0 до 42: ")
    val thirdUserInput = readln().toInt()

    userListNumbers.add(firstUserInput)
    userListNumbers.add(secondUserInput)
    userListNumbers.add(thirdUserInput)
//    println(userListNumbers)

    val sizeOfListGuessedNumbers = luckyListNumbers.intersect(userListNumbers)

    if (
        firstUserInput in MIN_LUCKY_NUMBER..MAX_LUCKY_NUMBER &&
        secondUserInput in MIN_LUCKY_NUMBER..MAX_LUCKY_NUMBER &&
        thirdUserInput in MIN_LUCKY_NUMBER..MAX_LUCKY_NUMBER
    ) {
        when (sizeOfListGuessedNumbers.size) {
            THREE_NUMBERS_WIN -> println("Поздравляем, вы угадали все три числа и выиграли джекпот")
            TWO_NUMBERS_WIN -> println("Поздравляем, вы угадали два числа из трёх и выиграли крупный приз")
            ONE_NUMBER_WINS -> println("Поздравляем, вы угадали одно число из трёх и выиграли утешительный приз")
            else -> println("К сожалению вы не угадали ни одного числа")
        }
    } else println("Пожалуйста вводите числа от 0 до 42")

    println(luckyListNumbers)
}