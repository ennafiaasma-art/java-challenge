import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        Scanner nom = new Scanner(System.in);
        System.out.println("entrer votre nom : ");
        String name = nom.nextLine();
        System.out.println("bonjour , " + name + "!");
        */






/*
       Scanner nombre = new Scanner(System.in);
        System.out.println("entrer un nombre ");
        int n = nombre.nextInt();
        System.out.println(n);

        for (int i = n ; i >= 0; i--) {
            System.out.println(i);

        }


 }



 */

        Scanner mine = new Scanner(System.in);
        System.out.println("entrer un nombre ");
        int n = mine.nextInt();
        System.out.println(n);
        int i = 0;
        while (i<= 10) {

            System.out.println(i);
            i++;

if (i==5){
    System.out.println("Bravo ! Vous avez trouvé.");
    int randomNum = (int) (Math.random() * 11);
}else if (i!=5){
    System.out.println("Trop petit ! Essayez encore.\n");
    int randomNum = (int) (Math.random() * 11);

}

        }


    }
}