class AnnalynsInfiltration {
    public static boolean canFastAttack(boolean knightIsAwake) {
        if(knightIsAwake != true){
            return true; 
        }else{
            return false;
        }
    }

    public static boolean canSpy(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake) {
        if(knightIsAwake == true || archerIsAwake == true || prisonerIsAwake == true){
            return true;
        }
        return false;
    }

    public static boolean canSignalPrisoner(boolean archerIsAwake, boolean prisonerIsAwake) {
        if(archerIsAwake == false && prisonerIsAwake == true){
            return true;
        }
        return false;
    }

    public static boolean canFreePrisoner(boolean knightIsAwake, boolean archerIsAwake, boolean prisonerIsAwake, boolean petDogIsPresent){
        if (petDogIsPresent != false) {
            return archerIsAwake != true;
        } else {
            return prisonerIsAwake != false && knightIsAwake != true && archerIsAwake != true;
        }
    }
}
