package com.jstn9.types;

public abstract class Amphibians extends Animal{

    protected boolean isPoisonous;
    protected String skinType;
    protected boolean canRegenerate;

    public Amphibians(String name, int age, String species, boolean isPoisonous, String skinType, boolean canRegenerate) {
        super(name, age, species);
        this.isPoisonous = isPoisonous;
        this.skinType = skinType;
        this.canRegenerate = canRegenerate;
    }

    @Override
    public String toString() {
        return "=== Amphibian ===\n" +
                super.toString() + "\n" +
                "Poisonous: " + (isPoisonous ? "Yes" : "No") + "\n" +
                "Skin type: " + skinType + "\n" +
                "Can regenerate: " + (canRegenerate ? "Yes" : "No");
    }
}
