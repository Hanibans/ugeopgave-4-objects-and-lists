package Opgave1;

public class Main {
    void main() {
        Student student1 = new Student("Lise", 24);
        Student student2 = new Student("Jakob", 27);
        Student student3 = new Student("Patrick", 21);

        Student[] students = {student1, student2, student3};

        System.out.println("=== STUDENTS ===");
        for (Student s : students) {
            s.printInfo();
        }

        Student oldest = students[0];

        for (Student s : students) {
            if (s.age > oldest.age) {
                oldest = s;
            }
        }

        System.out.println("\nThe oldest is: " + oldest.name);
    }
}
