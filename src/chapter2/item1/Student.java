package chapter2.item1;

public class Student {
    private String name;
    private static final Student instance = new Student("singleton");

    private Student(String name) {
        this.name = name;
    }
    private Student() {
    }

    public static Student from(String name) {
        return new Student(name);
    }

    public static Student getInstance() {
        return instance;
    }

    public static Student getStudent(boolean flag) {
        return flag ? new PrizeStudent() : new Student();
    }

    static class PrizeStudent extends Student {
    }
}
