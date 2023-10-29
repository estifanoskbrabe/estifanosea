import java.util.Arrays;
//home work for oop
public class Main {
    public static void main(String[] args) {
        // Create objects of Student, Teacher, College
        Student student1 = new Student("amir", 20,new int[]{57,99,100} );
        Teacher teacher1 = new Teacher("Mr. benaw", 35, "Mathematics");
        College college = new College();

        // Set values for attributes through the constructor

        // Add Student and Teacher objects into the College object
        college.addStudent(student1);
        college.addTeacher(teacher1);

        // Print some details to test
        System.out.println("Students:");
        for (Student student : college.getStudents()) {
            System.out.println("Name: " + student.getName());
            System.out.println("id: " + student.getid());
            System.out.println("grade: " + Arrays.toString(student.getgrade()));
            System.out.println();
        }

        System.out.println("Teachers:");
        for (Teacher teacher : college.getTeachers()) {
            System.out.println("Name: " + teacher.getName());
            System.out.println("id: " + teacher.getid());
            System.out.println("Subject: " + teacher.getSubject());
            System.out.println();
        }
    }
}