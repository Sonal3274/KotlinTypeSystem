/*
In this example, an extension function isNullOrEmpty is added to the nullable type String?.
The extension function checks if the string is null or empty.
This can be useful for avoiding the need for null checks in your code, making it cleaner and more concise.
*/

fun String?.isNullOrEmpty(): Boolean {
    return this == null || this.isEmpty()
}

fun main() {
    val s: String? = null
    println(s.isNullOrEmpty()) // Output: true

    val s2: String? = "not empty"
    println(s2.isNullOrEmpty()) // Output: false
}
