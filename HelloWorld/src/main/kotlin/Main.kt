fun seed(): String = "maxvakulenko2006-boop"

fun labNumber(): Int = 1

fun main(args: Array<String>) {
    println("Лабораторна робота №${labNumber()} користувача ${seed()}")

    var kitty = "Васько"
    kitty += " \uD83D\uDC31"
    val age = 7
    println("Кошеня №1 - $kitty віком $age років")

    val catName: String = "Мурзик \uD83D\uDC08"
    val weight: Float = 3.5f
    println("Кошеня №2 - $catName з вагою $weight кг")

    val cat3Name: String = "Рудий \uD83D\uDC06"
    val cat3Age: Int = 6
    val cat3Weight: Double = 8.2
    println("Кошеня №3 - $cat3Name віком $cat3Age років та вагою $cat3Weight кг")
}