fun main() {
    val a = 5f
    val b = 7f
    var summ: Float

    summ = a + b

    println(summ)

    summ = a % b
    println(summ)

    println(summ::class.simpleName)

    var counter: Int
    counter = 0

    counter = counter + 1
    counter += 1
    counter++
    ++counter

    println(counter)

    println(a > b)
    println(a < b)
    println(a == b)
    println(a >= b)
    println(a <= b)
    println(a != b)
}