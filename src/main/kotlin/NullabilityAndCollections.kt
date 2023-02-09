fun main(args: Array<String>) {
    // Nullable and non-nullable variables
    var nullableVariable: String? = "Hello"
    var nonNullableVariable: String = "World"

    println(nullableVariable)    // outputs: Hello
    println(nonNullableVariable)  // outputs: World

    nullableVariable = null
    // nonNullableVariable = null  // This line will give a compile error

    // Collections
    val list = listOf(1, 2, 3, 4, 5)
    println(list)   // outputs: [1, 2, 3, 4, 5]

    val mutableList = mutableListOf(1, 2, 3, 4, 5)
    mutableList.add(6)
    println(mutableList)  // outputs: [1, 2, 3, 4, 5, 6]

    val map = mapOf("one" to 1, "two" to 2, "three" to 3)
    println(map)  // outputs: {one=1, two=2, three=3}

    val mutableMap = mutableMapOf("one" to 1, "two" to 2, "three" to 3)
    mutableMap["four"] = 4
    println(mutableMap)  // outputs: {one=1, two=2, three=3, four=4}
}
