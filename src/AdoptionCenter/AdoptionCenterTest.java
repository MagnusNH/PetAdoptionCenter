package AdoptionCenter;

import java.util.Scanner;

public class AdoptionCenterTest {
    public void main (String[] args){
        Adoptioncenter();

    }

    public void Adoptioncenter(){
        Scanner input = new Scanner(System.in);
        Animals animals = new Animals("Navn:");

        Velkommen();
    }


    public void Velkommen(){
        System.out.println("Welcome to the adoption center!");
        System.out.println("Lets register some animals!");
        System.out.println("How many pets do you want to register?");
    }

    Scanner input = new Scanner(System.in);

}
