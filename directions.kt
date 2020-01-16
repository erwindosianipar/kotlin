fun main(){
    var directions = arrayOf("NORTH", "EAST", "SOUTH", "WEST")

    println("Choose: 0 (North), 1 (East), 2 (South), 3 (East)")
    print("Where are you direction right now: ")
    var directionUser = readLine()!!.toInt()
    println()

    println("Choose: 0 (Left), 1 (Right)")
    print("Where are you want to go: ")
    var pointUser = readLine()!!.toInt()
    println()

    print("How many times you want: ")
    var manyTimes = readLine()!!.toInt()
    println()

    if (directionUser >= 0 && directionUser <= 3) {
        if (pointUser >= 0 && pointUser <= 1) {
            if (pointUser == 1) {
                var position = directions[pointUser+manyTimes%4]
                println("Last position: $position")
            } else {
                var position = directions[(pointUser-manyTimes+4)%4]
                println("Last position: $position")
            }
        } else println("Oops, you choose the wrong point.")
    } else println("Oops, you choose the wrong direction.")
}