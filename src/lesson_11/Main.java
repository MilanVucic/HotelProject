package lesson_11;


public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Milan";
        person1.setAge(30);
        Person person2 = new Person();
        person2.name = "Lucy";
        person2.setAge(35);

        Student s = new Student();

        Teacher t = new Teacher();
        Person[] people = {person1, person2, s, t};
        for (int i = 0; i < people.length; i++) {
            Person p = people[i];
            p.sayHi();
        }
    }

    private static void castingExample() {
        byte b = 100; // 00101010
        //      00000000 00101010
        short s = b;
        int i = s;
        long l = 130;

        // 000000000000000000000000000100100100000 -> 100100000
        byte b2 = (byte) l;
        int i2 = (int) l;
        int biggestInt = Integer.MAX_VALUE;
        biggestInt++;
        System.out.println(biggestInt);
    }
}
