import java.util.Scanner;
import java.util.Random;

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

/*
        Random challenge = new Random();
        Scanner nombre = new Scanner(System.in);
        int n = 0;
        int num = challenge.nextInt(1,10);
        do {
            System.out.println("entrer un nombre ");
             n = nombre.nextInt();
            if (n == num) {
                System.out.println("Bravo ! Vous avez trouvé.\n");

            }else if(n < num){
                System.out.println("Trop petit ! Essayez encore.");
            }
            else {
                System.out.println("Trop grande ! Essayez encore.");
            }


        }while (n != num);
      /*



 */


        Scanner nombre = new Scanner(System.in);
        System.out.println("  \n1.consolter le solde  \n2.depot  :\n3.retait \n4.quitter \n     entrer votre choix :");
        int n = nombre.nextInt();
        if (n==1){
            System.out.println("votre solde est  100000 DH ");
        }else if (n==2){
            System.out.println("entrer un montant : ");
            n=nombre.nextInt();
            System.out.println("Dépôt effectué avec succès");
        } else if (n==3) {
            System.out.println("entrer un retrait :");
            n=nombre.nextInt();
            System.out.println("retrait  effectué avec succès");


        }else if(n==4){
            System.out.println("LA FIN DE PROGRAMME :");
        }


    }
}

















