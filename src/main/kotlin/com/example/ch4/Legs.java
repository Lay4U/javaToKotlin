package com.example.ch4;

import java.time.Duration;
import java.util.List;
import java.util.Optional;

public class Legs {
    public static Optional<Leg> findLongestLegOver(
            List<Leg> legs,
            Duration duration
    ) {
        Leg result = null;
        for (Leg leg : legs) {
            if (isLongerThan(leg, duration))
                if (result == null || isLongerThan(leg, result.getPlannedDuration())) {
                    result = leg;
                }
        }
        return Optional.of(result);
    }


    private static boolean isLongerThan(Leg leg, Duration duration) {
        return leg.getPlannedDuration().compaterTo(duration) > 0;
    }
}
