package AdoptionCenter;

import java.util.Scanner;

class Animals {
    protected String name;
    protected String animalType;
    protected String sound;
    private int [] location = {0,0,0,0,0,0};

    public Animals (String Name, String animalType, String sound){
        this.name=Name;
        this.animalType=animalType;
        this.sound=sound;
    }

    Scanner scan=new Scanner (System.in);
}
