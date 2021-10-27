package nl.novi.javaprogrammeren.huiswerk.inheritance;

public class Tiger extends Animal {

    private String cageName;
    private String lastDayFed;
    private String country;
    private int amountOfStripes;

    @Override
    public void sound() {
        System.out.println("Tiger Roar");
    }

    public String getCageName() {
        return cageName;
    }

    public void setCageName(String cageName) {
        this.cageName = cageName;
    }

    public String getLastDayFed() {
        return lastDayFed;
    }

    public void setLastDayFed(String lastDayFed) {
        this.lastDayFed = lastDayFed;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAmountOfStripes() {
        return amountOfStripes;
    }

    public void setAmountOfStripes(int amountOfStripes) {
        this.amountOfStripes = amountOfStripes;
    }
}
