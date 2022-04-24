package practicaMultiverse;

import java.util.Scanner;

public class SpideysRunner {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose your Spidey:\n 1. Ultimate Spider-Man (Miles Morales)\n 2. Spider-Gwen (Gwen Stacy)\n 3. Spider-Man 2099 (Miguel O'Hara)");
        int spideyId = scanner.nextInt();

        System.out.println("Write your Spidey's name (Miles, Gwen or Miguel)");
        String secretIdentity = scanner.next();

        System.out.println("How many punches your Spidey's gonna throw?");
        int punches = scanner.nextInt();

        System.out.println("How many kicks your Spidey's gonna throw?");
        int kicks = scanner.nextInt();


        chooseYourSpidey(spideyId, secretIdentity, punches, kicks);
    }

    private static void chooseYourSpidey(int spideyId, String secretIdentity, int punches, int kicks){
       switch (spideyId){
           case 1:
               SpideyAttacks miles = new MilesMorales(secretIdentity, punches, kicks);
               miles.displayAttack();
               break;
           case 2:
               SpideyAttacks gwen = new GwenStacy(secretIdentity, punches, kicks);
               gwen.displayAttack();
           case 3:
               SpideyAttacks miguel = new MiguelOHara(secretIdentity, punches, kicks);
               miguel.displayAttack();
       }
    }
}
