package OOPJava.Encapsulation;

public class Student {
    private String name;
    private int age;
    private String studentClass;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        setStudentClass(age);
    }

    private void setStudentClass(int age) {
        studentClass = "Class " + age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStudentClass() {
        return studentClass;
    }
}
