fun main() {
    println("Введите максимальное значение счетччика: ")
    var counter = readln()!!.toByte()

    do {
        println("Счетчик закончит считать через: ${counter--}")
        Thread.sleep(1000)
    }
        while (counter > 0)
        println("Bang!")
}