package com.jstn9.types;

public abstract class Birds extends Animal{
    protected double wingSpan;
    protected boolean canFly;
    protected String featherColor;

    public Birds(String name, int age, String species, double wingSpan, boolean canFly, String featherColor) {
        super(name, age, species);
        this.wingSpan = wingSpan;
        this.canFly = canFly;
        this.featherColor = featherColor;
    }

    @Override
    public String toString() {
        return "=== Birds ===\n" +
                super.toString() + "\n" +
                "Wing span: " + wingSpan + "\n" +
                "Can fly: " + (canFly ? "Yes" : "No") + "\n" +
                "Feather color: " + featherColor;
    }
}
