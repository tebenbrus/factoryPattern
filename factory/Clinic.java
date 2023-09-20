package factory;

import java.util.Scanner;

public class Clinic {
    public static void main(String[] args){
        Scanner  input = new Scanner(System.in);

        System.out.println("Pet Record");
        System.out.println("[1] Dog");
        System.out.println("[2] Cat\n");
        System.out.print("Choose your pet by number: ");
        Integer choice = input.nextInt();

        PetRecord petFile = new PetRecord();
        Pet pet;

        switch(choice){
            case 1 :  pet = new Dog();
                           petFile.setPetName("Bantay");
                           petFile.setPetId("D001");
                           petFile.setPet(pet);
                            ((Dog) pet).setBreed("German Shepperd");
                           break;
            case 2 :  pet = new Cat();
                           petFile.setPetName("Muning");
                           petFile.setPetId("C001");
                            petFile.setPet(pet);
                           ((Cat) pet).setNoOfLives(9);
        }

        System.out.println("Petname is " + petFile.getPetName());
        System.out.println("PetId is " + petFile.getPetId());
        System.out.println("Your pet is " + petFile.getPet().getClass().getSimpleName());
        System.out.println("Usual entertainment: " + petFile.getPet().play());
        System.out.println("Communication sound: " + petFile.getPet().makeSound());

    }
}
