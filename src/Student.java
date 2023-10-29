public class Student {
    private String name;
    private int id;
    private int[] grade;

    public Student(String name, int id, int[] grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getid() {
        return id;
    }

    public void setid(int id) {
        this.id = id;
    }

    public int[] getgrade() {
        return grade;
    }

    public void setgrade(int[] grade) {
        this.grade= grade;
    }
}

