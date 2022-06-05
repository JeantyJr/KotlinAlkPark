package com.cursokotlinjun.desafioalk

import java.util.*

fun main() {

    val car = Vehicle("AAU123A", VehicleType.AUTO, Calendar.getInstance(),"DISCOUNT_CARD_001")
    val bus = Vehicle("AAU124A", VehicleType.BUS, Calendar.getInstance(),"DISCOUNT_CARD_002")
    val moto = Vehicle("AAU123W", VehicleType.MOTO, Calendar.getInstance(),"DISCOUNT_CARD_011")
    val minibus = Vehicle("ABU123A", VehicleType.MINIBUS, Calendar.getInstance())

    val parking = Parking(mutableSetOf(), 4)
    val car2 = Vehicle("AAU123A", VehicleType.AUTO, Calendar.getInstance(),"DISCOUNT_CARD_005")

    val vehicleLis: MutableList<Vehicle> = mutableListOf(
        car,bus, minibus, moto,
        Vehicle("9087AAW", VehicleType.MINIBUS, Calendar.getInstance(), "DISCOUNT_CARD_007"),
        Vehicle("AQ879B", VehicleType.BUS, Calendar.getInstance(), "DISCOUNT_CARD_008")



    )

   vehicleLis.forEach { Vehicle -> parking.addVehicle(vehicle = Vehicle) }


   /* println(parking.vehicles.contains(car))
    println(parking.vehicles.contains(bus))
    println(parking.vehicles.contains(minibus))
    println(parking.vehicles.contains(moto)) */


}
