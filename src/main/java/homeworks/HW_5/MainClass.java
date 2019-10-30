package homeworks.HW_5;

import java.util.ArrayList;

public class MainClass {
    public static void main(String[] args) {

        Human human = new Human();
        Pet pet1 = new Pet("Dog", "Mestan", 3, 60, new String[]{"sleep", "drink"});
        Pet pet2 = new Pet("Cat", "Popsi", 2, 55, new String[]{"sleep","eat"});

        //System.out.println(pet.toString());
        Human father = new Human("Kamil", "Huseynov", 1971);
        Human mother = new Human("Xedice", "Huseynova", 1972);



        Human child1 = new Human("Elsad", "Huseynov", 1998, 88, pet1, mother, father);
        Human child2 = new Human("Kenan","Sultanov",1999,91,pet2,mother,father);
        Human child3 = new Human("Elmeddin", "Pasayev",1998,93,pet1,mother,father);

        //System.out.println(child1.toString());

        System.out.println("");


       ArrayList<Human> children = new ArrayList<Human>();



        Family family1 = new Family(father,mother,children,pet1);
        //for Homework 5
        System.out.println(family1.toString());

        family1.addChild(child1);
        family1.addChild(child2);
        family1.addChild(child3);

        if(family1.deletechild(1)){
            System.out.println("Child is deleted...");
        }else
            System.out.println("Child isn't deleted");


        System.out.println("--------------------------------------");
        System.out.println(family1.toString());
        System.out.println("Family count : "+ family1.family_count());







        //methods for human
        // human.greetPet(pet);
        //  human.describePet(pet);

        //methods for pet
        // pet.eat();
        // pet.respond();
        // pet.foul();
    }
}
