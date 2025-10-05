import java.util.Objects;

public class Student {
    String name;
    int id;

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString(){
        return "Student{" + "Name: " + name + ',' + " RollNo: " + id + '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
