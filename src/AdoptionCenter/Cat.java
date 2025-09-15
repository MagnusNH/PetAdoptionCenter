package AdoptionCenter;

public class Cat extends Animals {

    public Cat (String name, String animalType, String sound){
        super(name, animalType, sound);
    }

    public String makeSound(){
        return ("Meow");
    }

    //Setters
    public void setName(String name) {this.name=name;}
    public void setSound(String sound) {this.sound=sound;}
    public void setanimalType(String animalType){this.animalType=animalType;}

    //getters
    public String getName(){return name;}

    public String getSound(){return sound;}

    public String getanimalType(){return animalType;}

    @Override
    public String toString(){
        return "Animal: " + animalType + "Name: " + name + "Sound: " + sound;
    }
}
