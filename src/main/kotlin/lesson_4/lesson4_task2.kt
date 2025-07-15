package lesson_4

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val VOLUME = 100

fun main() {
    var weightOfLuggage = 20
    var volumeOfLuggage = 80
//  Не было бы лучше отдельно записать вычисления в переменную, а в принте просто вывести её?
//  var average = (MIN_WEIGHT < weightOfLuggage && weightOfLuggage <= MAX_WEIGHT) && volumeOfLuggage < VOLUME

//  println("Груз с весом $weightOfLuggage кг и объемом $volumeOfLuggage л соответствует категории 'Average': $average")
    println(
        "Груз с весом $weightOfLuggage кг и объемом $volumeOfLuggage л соответствует категории 'Average': ${
            !(weightOfLuggage <= MIN_WEIGHT) && 
            weightOfLuggage <= MAX_WEIGHT && 
            volumeOfLuggage < VOLUME
        }"
    )

    weightOfLuggage = 50
    volumeOfLuggage = 100
//  average = (MIN_WEIGHT < weightOfLuggage && weightOfLuggage <= MAX_WEIGHT) && volumeOfLuggage < VOLUME

//  println("Груз с весом $weightOfLuggage кг и объемом $volumeOfLuggage л соответствует категории 'Average': $average")
    println(
        "Груз с весом $weightOfLuggage кг и объемом $volumeOfLuggage л соответствует категории 'Average': ${
            !(weightOfLuggage <= MIN_WEIGHT) &&
            weightOfLuggage <= MAX_WEIGHT && 
            volumeOfLuggage < VOLUME
        }"
    )
}