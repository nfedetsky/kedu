fun main() {
    println("Введите максимальное значение счетччика: ")
    var counter = readln()!!.toByte()
    while (counter > 0) {

        println("Счетчик закончит считать через: ${counter--}")
        Thread.sleep(1000)
    }
    println("Bang!")
}