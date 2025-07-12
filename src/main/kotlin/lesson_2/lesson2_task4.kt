package lesson_2
const val BUFF = 1.2f

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val crystalBuffed = (crystalOre * BUFF - crystalOre) - (crystalOre * BUFF - crystalOre) % 1
    val ironBuffed = (ironOre * BUFF - ironOre) - (ironOre * BUFF - ironOre) % 1

    println(String.format("\nС помощью бафа были получены дополнительные:\n%.0f ед. кристальной руды\n%.0f ед. железной руды",
        crystalBuffed,
        ironBuffed
    ))
}