package lesson_4

const val NUMBER_OF_TABLES = 13

fun main() {
    val reservedTablesToday = NUMBER_OF_TABLES
    val reservedTablesTomorrow = 9
    val unReservedTablesToday = (reservedTablesToday < NUMBER_OF_TABLES)
    val unReservedTablesTomorrow = (reservedTablesTomorrow < NUMBER_OF_TABLES)

    println("Доступность столиков на сегодня: $unReservedTablesToday\nДоступность столиков на завтра: $unReservedTablesTomorrow")
}