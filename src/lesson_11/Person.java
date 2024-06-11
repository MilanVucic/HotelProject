package lesson_11;

public class Person {
    String name;
    private int age;
    private String email;

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative");
            this.age = 0;
        }
    }

    public int getAge() {
        return age;
    }

    public void sayHi() {
        System.out.println("Hi from person class");
    }
}
