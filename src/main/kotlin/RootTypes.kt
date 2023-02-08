
fun main() {
    // "Any" is the root type in Kotlin, representing any non-null type
    var anyValue: Any = "This is a string value"
    println(anyValue)  // Output: This is a string value

    anyValue = 123456
    println(anyValue)  // Output: 123456

    // "Any?" is a nullable version of the root type Any
    var nullableAny: Any? = null
    println(nullableAny)  // Output: null

    nullableAny = "This is another string value"
    println(nullableAny)  // Output: This is another string value
}
