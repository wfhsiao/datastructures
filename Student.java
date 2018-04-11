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
    public static void main(String[] args) {
        Student s = new Student("106406001", "張三", 20);
        System.out.printf("s=(%s, %s, %d)\n", s.no, s.name, s.age);
    }
}
