fun main(){
    var name = "Erwindo"
    println("Hello $name")


    var intNumber = 3
    var floatNumber = 3.14f
    var doubleNumber = 3.14
    var longNumber = 100000000000


    println("integer: $intNumber, ${intNumber is Int}")
    println("float: $floatNumber")
    println("double: $doubleNumber")
    println("long: $longNumber")

    var a = 7
    var b = 2.0f
    var c: Float=a/b
    println(c)
    println(c is Float)
}