package br.com.zup.SlotMachinespring.model;

public enum Symbol {
    BANANA(10),
    STRAWBERRY(20),
    STAR(40);

    private final int points;

    Symbol(int points) {
        this.points = points;
    }

    public int getPoints() {
        return points;
    }

    public String getLowerCaseName() {
        return name().toLowerCase();
    }
}
