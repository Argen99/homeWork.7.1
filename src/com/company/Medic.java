package com.company;

public class Medic extends Hero{

    @Override
    public String applySuperAbility(String superAbilityType) {
        return "Лечит" + superAbilityType;

    }
}
