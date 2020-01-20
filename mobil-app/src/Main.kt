import Antenna.Antenna
import Antenna.Grid
import Antenna.Area

fun main() {

    var antennas: ArrayList<Antenna> = ArrayList()
    var grids: ArrayList<Grid> = ArrayList()
    var areas: ArrayList<Area> = ArrayList()
    var xCoordinate: Int
    var yCoordinate: Int

    var howManyAntenna = inputHowManyAntenna()
    for (i in 0 until howManyAntenna step 1) {
        println("Antenna $i")
        var x = inputXCoordinate()
        var y = inputYCoordinate()
        antennas.add(Antenna(x, y))
        grids.add(x, y)
        areas.add(x, y)
    }
}

fun inputXCoordinate(): Int {
    println("Insert x coordinate antenna: ")
    return readLine()!!.toInt()
}

fun inputYCoordinate(): Int {
    println("Insert y coordinate antenna: ")
    return readLine()!!.toInt()
}

fun inputHowManyAntenna(): Int {
    print("Insert how many antenna you want: ")
    return readLine()!!.toInt()
}