import java.lang.reflect.Array;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        Student s = new Student();
        s.setId(1);
        s.setName("Alex");
        Student b = new Student();
        b.setId(2);
        b.setName("Anna");
        Student[] students = new Student[0];
        students = s.add(students, s);
        students = b.add(students, b);
        for(int i = 0; i < students.length; i++)
        {
            System.out.println(students[i].showInfo());
        }
    }
}
