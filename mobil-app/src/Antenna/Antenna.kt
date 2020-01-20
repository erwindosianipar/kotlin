package Antenna

class Antenna {
    var xCoordinate: Int
        private set
    var yCoordinate: Int
        private set

    var coversArea: ArrayList<Int> = ArrayList()

    constructor(xCoordinate: Int, yCoordinate: Int) {
        this.xCoordinate = xCoordinate
        this.yCoordinate = yCoordinate
    }
}