package AdoptionCenter;

import java.util.Scanner;

public class AdoptionCenterTest {
    public void main (String[] args){
        Adoptioncenter();
        int size=7;
    }

    public void Adoptioncenter(){
        Scanner scan = new Scanner(System.in);
        Velkommen();
        System.out.println("How many pets would you like to register?:");
        String line1 = scan.nextLine();
    }

    public void Velkommen(){
        System.out.println("Welcome to the adoption center!");
        System.out.println("Lets register some animals!");
    }

}
