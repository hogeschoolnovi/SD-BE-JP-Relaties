package nl.novi.javaprogrammeren.huiswerk.inheritance;

public class Wolf extends Animal {

    private String cageName;
    private String lastDayFed;
    private String country;
    private String packName;

    @Override
    public void sound() {
        System.out.println("Wolf roar");
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

    public String getPackName() {
        return packName;
    }

    public void setPackName(String packName) {
        this.packName = packName;
    }
}
