package com.example.ch4

import java.time.Duration

//
//import java.time.Duration
//import java.util.*
//
//object Legs {
//    @JvmStatic
//    fun findLongestLegOver(
//        legs: List<Leg>,
//        duration: Duration
//    ): Optional<Leg> {
//        return Optional.ofNullable(longestLegOver(legs, duration));
//    }
//
//    fun longestLegOver(legs: List<Leg>, duration: Duration): Leg? {
//        var result: Leg? = null
//        for (leg in legs) {
//            if (isLongerThan(leg, duration))
//                if (result == null ||
//                    isLongerThan(leg, result.plannedDuration)
//                )
//                    result = leg
//        }
//        return result
//    }
//
//    private fun isLongerThan(leg: Leg, duration: Duration): Boolean {
//        return leg.plannedDuration.compareTo(duration) > 0
//    }
//}


//fun longestLegOver(
//    legs: List<Leg>,
//    duration: Duration
//): Leg? {
//    var result: Leg? = null
//    for (leg in legs) {
//        if (leg.isLongerThan(duration))
//            if (result == null ||
//                leg.isLongerThan(result.plannedDuration)
//            )
//                result = leg
//    }
//    return result
//}

fun List<Leg>.longestOver(duration: Duration): Leg? {
    val longestLeg = maxByOrNull(Leg::plannedDuration)
    return when {
        longestLeg == null -> null
        longestLeg.plannedDuration > duration -> longestLeg
        else -> null
    }
}


private fun Leg.isLongerThan(duration: Duration) =
    this.palnnedDuration.compareTo(duration) > 0