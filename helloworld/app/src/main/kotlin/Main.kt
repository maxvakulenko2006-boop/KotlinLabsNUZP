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

    val kitty3Name: String = "Рудий \uD83D\uDC06"
    val kitty3Age: Int = 6
    val kitty3Weight: Double = 8.2
    println("Кошеня №3 - $kitty3Name віком $kitty3Age років та вагою $kitty3Weight кг")
}