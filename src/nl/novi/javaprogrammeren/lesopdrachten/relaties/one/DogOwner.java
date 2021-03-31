package nl.novi.javaprogrammeren.lesopdrachten.relaties.one;

public class DogOwner {

    private String name;
    private String sex;

    private Dog dog;

    public DogOwner(String name, String sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public void ageDog() {
        if(dog != null) {
            this.dog.age();
        }
    }

    @Override
    public String toString() {
        String s = name + " heeft een " + dog.getSex() + " deze is " + dog.getAge();
        return s;
    }
}
