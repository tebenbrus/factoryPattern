package factory;

import java.util.Scanner;

public class Clinic {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println();
            System.out.println("Pet Record");
            System.out.println("[1] Dog");
            System.out.println("[2] Cat");
            System.out.println("[3] Exit\n");

            System.out.print("Choose your pet by number: ");

            Integer choice = input.nextInt();
            PetRecord petFile = new PetRecord();
            Pet pet = null;
            boolean exit = true;

            switch (choice) {
                case 1:
                    pet = new Dog();
                    petFile.setPetName("Bantay");
                    petFile.setPetId("D001");
                    petFile.setPet(pet);
                    ((Dog) pet).setBreed("German Shepperd");
                    break;
                case 2:
                    pet = new Cat();
                    petFile.setPetName("Muning");
                    petFile.setPetId("C001");
                    petFile.setPet(pet);
                    ((Cat) pet).setNoOfLives(9);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input. Please type again.");
                    exit = false;
            }
            if(exit) {

                System.out.println("Petname is " + petFile.getPetName());
                System.out.println("PetId is " + petFile.getPetId());
                System.out.println("Your pet is " + petFile.getPet().getClass().getSimpleName());
                if(choice == 1)
                {
                    System.out.println("Breed is " + ((Dog)pet).getBreed());
                }
                else{
                    System.out.println("Cat lives: " + ((Cat)pet).getNoOfLives());
                }
                System.out.println("Usual entertainment: " + petFile.getPet().play());
                System.out.println("Communication sound: " + petFile.getPet().makeSound());


            }
        }
    }
}
