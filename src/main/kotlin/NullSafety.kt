

/*
* Kotlin doesn't allow you to call a function on null reference.
*/

fun main() {
    var gender:String = "Male"
    var gender2:String? = null
    var isAdult:Boolean? = true

    if (gender2 != null) {
        println(gender2.toUpperCase())
    }

    println(gender2?.toUpperCase())

    gender2?.let { //In this block of let the value will not be null.
        println("Line 1")  // the benefit of using let is that it'll give us not nullable option.
        println("Line 2 $gender2")
        println("Line 3 $it") // "it" points to gender2
    }

    var selectedValues = gender2 ?: "NA" // We used Elvis operator(?:). Here, if the value is null it'll take default value as "NA" else it'll just execute normally.
    var value = gender2!!.toUpperCase() // Here, if the value is null it'll throw error else will execute normally.
}