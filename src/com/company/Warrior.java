package com.company;

public class Warrior extends Hero{
    @Override
    public String applySuperAbility(String superAbilityType) {
        return "Стреляет из лука" + superAbilityType;

    }
}
