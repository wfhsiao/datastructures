/**
 *
 * @author user
 */
public class Student {
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
}
