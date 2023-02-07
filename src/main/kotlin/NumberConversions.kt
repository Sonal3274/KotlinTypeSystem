fun main(args: Array<String>) {
    val intValue: Int = 56
    val longValue: Long = intValue.toLong()
    val floatValue: Float = intValue.toFloat()
    val doubleValue: Double = intValue.toDouble()
    val shortValue: Short = intValue.toShort()
    val byteValue: Byte = intValue.toByte()
    val stringValue: String = intValue.toString()

    println("int: $intValue")
    println("long: $longValue")
    println("float: $floatValue")
    println("double: $doubleValue")
    println("short: $shortValue")
    println("byte: $byteValue")
    println("string: $stringValue")
}
