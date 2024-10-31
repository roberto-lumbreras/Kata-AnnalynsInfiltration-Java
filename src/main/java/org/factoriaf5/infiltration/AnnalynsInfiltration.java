package org.factoriaf5.infiltration;

public class AnnalynsInfiltration {

    public static boolean canFastAttack(boolean knightIsAwake) {
        // Implement method
        return !knightIsAwake;
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        // Implement method
        return knightIsAwake||archerIsAwake||prisonerIsAwake;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        // Implement method
        return !archerIsAwake&&prisonerIsAwake;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake,
            boolean petDogIsPresent) {
        // Implement method
        return (petDogIsPresent&&!archerIsAwake)||(!petDogIsPresent&&prisonerIsAwake&&!knightIsAwake&&!archerIsAwake);
    }

}
