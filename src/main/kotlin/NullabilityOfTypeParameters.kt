// Nullable type parameter example
class Box<T>(t: T?) {
    var value = t
}

// Non-nullable type parameter example
class NonNullBox<T : Any>(t: T) {
    var value = t
}

fun main() {
    // Creating an instance of Box with nullable type parameter
    val nullableBox = Box(null)
    println("Value in Nullable Box: ${nullableBox.value}")

    // Creating an instance of Box with non-nullable type parameter
    val nonNullBox = NonNullBox("Hello")
    println("Value in Non-Null Box: ${nonNullBox.value}")
}
