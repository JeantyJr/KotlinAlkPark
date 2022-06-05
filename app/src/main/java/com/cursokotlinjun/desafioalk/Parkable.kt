package com.cursokotlinjun.desafioalk

import java.util.*
import kotlin.math.ceil

const val MINUTES_IN_MILISECONDS = 60000

data class Parkable(
        // val plate: String,
        val vehicles: MutableSet<Vehicle>,
) {
    var countVehi: Int = 0
     var countFee: Int = 0
    fun checkOutVehicle(plate: String, onSucces: (amount: Int) -> Unit, onError: () -> Unit) {
        val saveVehi = vehicles.map { it }.filter { it.plate == plate }
        //var countVeh: Int = 0
        //var countFee: Int = 0

        if (saveVehi.isNotEmpty()) {

            val findVehi = saveVehi[0]
            val tarifaFinal = calculateFee(findVehi.vehicleType, findVehi.parkedTime.toInt(), findVehi.discountCard != null)
            onSucces(tarifaFinal)
            vehicles.remove(findVehi)
            countVehi++
            countFee += tarifaFinal
            println("Your fee is $tarifaFinal . Come back soon.")
        } else {
            onError()
            println("Sorry, the check-out failed")
        }
    }

    @Suppress("UNREACHABLE_CODE")
    fun calculateFee(type: VehicleType, parkedTime: Int, hasDiscountCard: Boolean): Int {
        var fee: Int = 0
        val overTime = 15F
        val around: Int = ceil(parkedTime / overTime).toInt()
        val twoHour: Int = 8
        if (around <= twoHour) {
            fee = type.tarifa
            return fee
        } else {
            fee = type.tarifa + (5 * (around - twoHour))
            return fee
        }

        return if (hasDiscountCard) {
            fee *= (0.85).toInt()
            fee
        } else {
            fee
        }


    }
}

