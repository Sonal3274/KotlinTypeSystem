class Example {
    lateinit var name: String

    fun initName(name: String) {
        this.name = name
    }
}

fun main() {
    val example = Example()
    example.initName("John Doe")
    println(example.name) // Output: John Doe
}
