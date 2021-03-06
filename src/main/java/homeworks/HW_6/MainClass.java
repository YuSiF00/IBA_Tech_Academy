package homeworks.HW_6;

import java.util.*;

public class MainClass {

    public static void main(String[] args) throws Throwable {


        Human human = new Human();
        HashMap<DayOfWeek, String> schedule1 = new HashMap<>();
        schedule1.put(DayOfWeek.MONDAY, "go to library");
        schedule1.put(DayOfWeek.FRIDAY, "go to course");

        HashMap<DayOfWeek, String> schedule2 = new HashMap<>();
        schedule2.put(DayOfWeek.SUNDAY, "go to Cinema with friends");
        schedule2.put(DayOfWeek.TUESDAY, "go to courses; watch a film");


        Pet pet1 = new Pet(Species.valueOf("DOG"), "Oliver", 3, 60, new String[]{"sleep", "drink"});
        Pet pet2 = new Pet(Species.valueOf("CAT"), "Oscar", 2, 55, new String[]{"sleep", "eat"});

        Human father = new Human("Joseph", "Smith", 1971);
        Human mother = new Human("Stella", "Smith", 1972);


        Human child1 = new Human("Leo", "Smith", 1998, 88, pet1, mother, father, schedule1);
        Human child2 = new Human("Harry", "Smith", 1999, 91, pet2, mother, father);
        Human child3 = new Human("Helen", "Smith", 1998, 93, pet1, mother, father, schedule2);

        System.out.println("");

        ArrayList<Human> children = new ArrayList<>();

        Family family1 = new Family(father, mother, children, pet1);
        System.out.println(family1.toString());

        family1.addChild(child1);
        family1.addChild(child2);
        family1.addChild(child3);


        if (family1.deletechild(1)) {
            System.out.println("Child is deleted...");
        } else
            System.out.println("Child isn't deleted");

        System.out.println("--------------------------------------");
        System.out.println(family1.toString());
        System.out.println("Family count : " + family1.family_count());

        family1.finalize();
    }
}
