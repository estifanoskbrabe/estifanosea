import java.util.ArrayList;
import java.util.List;
//class college

public class College {
    private List<Student> students;
    private List<Teacher> teachers;

    public College() {
        students = new ArrayList<>();
        teachers = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }
}