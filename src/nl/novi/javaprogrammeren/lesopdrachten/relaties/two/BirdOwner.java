package nl.novi.javaprogrammeren.lesopdrachten.relaties.two;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;

public class BirdOwner {

    private String name;
    private String sex;

    private List<Bird> birds;

    public BirdOwner(String name, String sex) {
        this.name = name;
        this.sex = sex;
        this.birds = new ArrayList();
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

    public void addBird(Bird bird) {
        if(!containsBird(bird)) {
            birds.add(bird);
        }
    }

    public boolean containsBird(Bird bird) {
        for(Bird ownedBird : birds) {
            if(bird.getRingNumber().equals(ownedBird.getRingNumber())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder(this.getName());
        for(Bird ownedBird : birds) {
            stringBuilder.append("\n"); // New line
            stringBuilder.append(ownedBird.toString()); // We gebruiken de toString uit de Bird-klasse!
        }
        return stringBuilder.toString();
    }

    //Uitdagend
    public void changeListToFiveFemalesAndFiveMales() {
        List<Bird> femaleList = pickFiveRandomBirdsWithGender("female");
        List<Bird> maleList = pickFiveRandomBirdsWithGender("male");

        //Combine the two lists:
        // Here we make a Stream of both lists and combine them into a new List.
        this.birds = Stream.concat(femaleList.stream(), maleList.stream()).toList();
    }

    public List<Bird> pickFiveRandomBirdsWithGender(String gender) {
        if(countGender(gender) >= 5) {
            List<Bird> allGenders = this.birds.stream()
                    .filter(bird -> bird.getGender().equals(gender))
                    .toList();
            return getXRandomBirds(allGenders, 5);
        }
        throw new RuntimeException("Could find enough birds with gender: " + gender);
    }


    public List<Bird> getXRandomBirds(List<Bird> genderBirdList, int amount) {
        Random rand = new Random();

        // create a temporary list for storing Bird
        List<Bird> randomBirdList = new ArrayList<>();
        for (int i = 0; i < amount; i++) {

            // take a random index between 0 to size of given List
            int randomIndex = rand.nextInt(genderBirdList.size());

            // add element in temporary list
            boolean isInList = false;
            Bird randomBird = genderBirdList.get(randomIndex);
            for(Bird pickedBird : randomBirdList) {
                if (pickedBird.getRingNumber().equals(randomBird.getRingNumber())) {
                    isInList = true;
                    break;
                }
            }
            if(!isInList) {
                randomBirdList.add(randomBird);
            } else {
                // Bird is already picked, so we want to redo this round.
                i--;
            }
        }
        return randomBirdList;
    }

    public int countGender(String gender) {
        int genderCounter = 0;
        for(Bird ownedBird : birds) {
            if(ownedBird.getGender().equals(gender)) {
                genderCounter++;
            }
        }
        return genderCounter;
    }
}
