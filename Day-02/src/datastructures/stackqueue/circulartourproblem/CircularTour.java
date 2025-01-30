package datastructures.stackqueue.circulartourproblem;

class CircularTour {
    public static int findStartingPoint(PetrolPump[] pumps) {
        int totalSurplus = 0; // Total petrol surplus
        int currentSurplus = 0; // Surplus petrol at current stage
        int startIndex = 0; // Starting pump index

        for (int i = 0; i < pumps.length; i++) {
            int petrolGain = pumps[i].petrol - pumps[i].distance;
            totalSurplus += petrolGain;
            currentSurplus += petrolGain;

            // If current surplus drops below zero, reset starting index
            if (currentSurplus < 0) {
                startIndex = i + 1; // Set the next station as the starting point
                currentSurplus = 0; // Reset current surplus
            }
        }

        // If total surplus is negative, no valid tour exists
        return (totalSurplus >= 0) ? startIndex : -1;
    }
}

