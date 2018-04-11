/**
 *
 * @author user
 */
public class Student implements Comparable<Student>{
    String no, name;    
    int age;
    public Student(String no, String name, int age) {
        this.no =no;
        this.name=name;
        this.age=age;
    }
    // Arrays.toString
    public String toString() {
        return String.format("(%s, %s, %d)", no, name, age);
    }

    @Override
    public int compareTo(Student o) {
        if (age < o.age) return -1;
        if (age > o.age) return 1;
        return 0;
    }
}
