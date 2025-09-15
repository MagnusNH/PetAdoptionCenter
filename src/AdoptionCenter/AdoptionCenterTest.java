package AdoptionCenter;

import java.util.Scanner;

public class AdoptionCenterTest {
    public static void main(String[] args) {
        Velkommen();
        Adoptioncenter();
    }

    public static void Adoptioncenter() {
        //Scanner implementeres
        Scanner scan = new Scanner(System.in);
        System.out.println("How many pets would you like to register?:");
        //Antal af input
        int n = scan.nextInt();
        //Scan og lave ny linje.
        scan.nextLine();
        //Laver et array på Animals
        Animals[] animals = new Animals[n];
        //putter input ind i et array
        for (int i = 0; i < n; i++) {
            System.out.println("What is the name?");
            String name = scan.nextLine();
            System.out.println("What is the type?(Cat,Dog,Lizard)");
            String type = scan.nextLine();
            //Hvis der skrives Dog køres første array.
            if (type.equalsIgnoreCase("Dog")) {
                animals[i] = new Dog(name, type, "Bark");

                //Hvis der skrives Cat køres første array.
            } else if (type.equalsIgnoreCase("Cat")) {
                animals[i] = new Cat(name, type, "Meow");

                //Hvis der skrives Lizard køres første array.
            } else if (type.equalsIgnoreCase("Lizard")) {
                animals[i] = new Lizzard(name, type, "pttts");
            }
            for (animals : a)
        }
    }

    public static void Velkommen() {
        System.out.println("Welcome to the adoption center!");
        System.out.println("Lets register some animals!");
    }
}


    //Prøv denne:
    //for (int i=0; i < arraynavn.length; i++)
    //System.out.println("Cage " + i + "is taken by" + arraynavn[i]);
