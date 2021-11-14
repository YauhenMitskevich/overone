package lesson24;

public class Fruit {
    String apple;
    String cherry;
    int countAppleBones;
    int countCherryBones;

    Fruit() {
        apple = "Apple";
        cherry = "Cherry";
        countAppleBones = 14;
        countCherryBones = 23;
    }

    class Bone {
        public void countOfBone() {
            System.out.println(apple + "has " + countAppleBones + "bones");
            System.out.println(cherry + "has " + countCherryBones + "bones");
        }
    }
}
