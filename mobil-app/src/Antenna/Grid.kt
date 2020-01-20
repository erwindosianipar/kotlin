package Antenna

class Grid {
    var xCoordinate: Int
    var yCoordinate: Int

    var gridArea: ArrayList<Int> = ArrayList()

    constructor(xCoordinate: Int, yCoordinate: Int) {
        gridArea.add(xCoordinate, yCoordinate)
    }
}