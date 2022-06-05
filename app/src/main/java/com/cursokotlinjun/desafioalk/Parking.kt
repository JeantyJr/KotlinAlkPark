package com.cursokotlinjun.desafioalk

import java.util.*

data class Parking(
        val vehicles: MutableSet<Vehicle>,
        val maxVehicles: Int = 4,
        val parkable: Parkable = Parkable(vehicles),
        var acumular: Pair<Int, Int> = Pair (parkable.countFee, parkable.countVehi)
) {


    fun addVehicle(vehicle: Vehicle): Boolean {
        if (vehicles.size < maxVehicles) {
            vehicles.add(vehicle)
            println("Welcome to AlkeParking!")
            return true
        } else {
            println("Sorry, the check-in failed")
            return false

        }
    }

    fun ganancias() {
        //acumular.first+parkable.countVehi
        //acumular.second+parkable.countFee
        acumular.first
        acumular.second
        println("${acumular.first} vehicles have checked out and have earnings of ${acumular.second}")
    }

     fun listVehicles(): List<Unit> {
          return vehicles.map { println(it.plate) }

    }

}






