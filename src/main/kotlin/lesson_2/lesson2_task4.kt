package lesson_2
const val BUFF = 20f

fun main() {
    val crystalOre = 7
    val ironOre = 11
    val percentBuff = BUFF / 100
    val crystalBuffed = (crystalOre * percentBuff).toInt()
    val ironBuffed = (ironOre * percentBuff).toInt()

    println("С помощью бафа были получены дополнительные: \n$crystalBuffed ед. кристальной руды \n$ironBuffed ед. железной руды")
}