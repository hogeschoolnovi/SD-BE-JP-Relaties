package nl.novi.javaprogrammeren.huiswerk.inheritance;

public class Lion extends Animal {

    private String cageName;
    private String lastDayFed;
    private String country;
    private int amountOfKids;

    @Override
    public void sound() {
        System.out.println("Lion Roar");
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

    public int getAmountOfKids() {
        return amountOfKids;
    }

    public void setAmountOfKids(int amountOfKids) {
        this.amountOfKids = amountOfKids;
    }
}
