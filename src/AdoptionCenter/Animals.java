package AdoptionCenter;

import java.util.Scanner;

class Animals {
    protected String name;
    protected String animalType;
    protected String sound;
    private int [] location = {0,0,0,0,0,0};

    public Animals (String Name, String animalType, String sound, int location){
        this.name=Name;
        this.animalType=animalType;
        this.sound=sound;
        this.location= new int[]{location};
    }

    Scanner scan=new Scanner (System.in);
}
