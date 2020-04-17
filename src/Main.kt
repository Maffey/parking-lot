package parking

import java.util.Scanner

data class Car(val registrationNumber: String, val color: String)

fun main() {
    val parkingLot = mutableListOf<Car>()
    parkingLot.add(Car("KA-01-HH-1234", "Blue"))

    val scanner = Scanner(System.`in`)
    val userChoice = scanner.next()

    if (userChoice == "park") {
        val parkedCar = Car(scanner.next(), scanner.next())
        parkingLot.add(parkedCar)
        println("${parkedCar.color} car parked on the spot ${parkingLot.size}.")
    } else if (userChoice == "leave") {
        val leavingSpot = scanner.nextInt()
        if (leavingSpot in 1..parkingLot.size) {
            parkingLot.removeAt(leavingSpot - 1)
            println("Spot $leavingSpot is free.")
        } else {
            println("There is no car in the spot $leavingSpot.")
        }
    } else {
        println("Wrong command.")
    }
}