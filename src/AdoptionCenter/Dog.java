package AdoptionCenter;

public class Dog extends Animals{

    public Dog (String name, String animalType, String sound) {
        super(name, animalType, sound);

    }

    //getters
    public String getName() {
        return name;
    }

    public String getAnimalType() {
        return animalType;
    }

    public String getSound() {
        return sound;
    }

    //setters
    public String setName() {
        return name;
    }

    public String setAnimalType() {
        return animalType;
    }

    public String setSound() {
        return sound;
    }
    @Override
    public String toString(){
        return "Animal: " + animalType + "Name: " + name + "Sound: " + sound;
    }
}

