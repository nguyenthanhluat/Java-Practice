package OOPJava.Encapsulation;

public class EncapsulationPractice {
    public static void testEncapsulation(){
        Student student = new Student("Nam", 12);
        System.out.println(student.getName() + " - " + student.getAge() + " - " + student.getStudentClass());
    }
}
