package br.com.zup.SlotMachinespring.controller.dtos;

public class SortitionDTO {
    private String firstSymbol;
    private String secondSymbol;
    private String thirdSymbol;
    private int totalPoints;

    public SortitionDTO(String firstSymbol, String secondSymbol, String thirdSymbol, int totalPoints) {
        this.firstSymbol = firstSymbol;
        this.secondSymbol = secondSymbol;
        this.thirdSymbol = thirdSymbol;
        this.totalPoints = totalPoints;
    }

    public String getFirstSymbol() {
        return firstSymbol;
    }

    public void setFirstSymbol(String firstSymbol) {
        this.firstSymbol = firstSymbol;
    }

    public String getSecondSymbol() {
        return secondSymbol;
    }

    public void setSecondSymbol(String secondSymbol) {
        this.secondSymbol = secondSymbol;
    }

    public String getThirdSymbol() {
        return thirdSymbol;
    }

    public void setThirdSymbol(String thirdSymbol) {
        this.thirdSymbol = thirdSymbol;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }
}


