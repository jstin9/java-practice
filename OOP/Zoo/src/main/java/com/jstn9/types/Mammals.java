package com.jstn9.types;

public abstract class Mammals extends Animal{
    protected boolean hasFur;
    protected String furColor;
    protected boolean isPredator;

    public Mammals(String name, int age, String species, boolean hasFur, String furColor, boolean isPredator) {
        super(name, age, species);
        this.hasFur = hasFur;
        this.furColor = furColor;
        this.isPredator = isPredator;
    }
    @Override
    public String toString() {
        return "=== Mammal ===\n" +
                super.toString() + "\n" +
                "Has fur: " + (hasFur ? "Yes" : "No") + "\n" +
                "Fur color: " + furColor + "\n" +
                "Is predator: " + (isPredator ? "Yes" : "No");
    }
}
