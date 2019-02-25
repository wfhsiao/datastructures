/**
 *
 * @author user
 */
public class Student implements Comparable<Student>{
    String no, name;    
    int age;
    static int col=0;
    public Student(String no, String name, int age) {
        this.no =no;
        this.name=name;
        this.age=age;
    }
    // Arrays.toString
    public String toString() {
        return String.format("(%s, %s, %d)", no, name, age);
    }

    public static void setCol(int c) {
        col = c;
    }
    @Override
    public int compareTo(Student o) {
        if (col==0)  // sort by no
            return no.compareTo(o.no);
        else if (col==1) // sort by name
            return name.compareTo(o.name);
        else {
            if (age < o.age) return -1;
            if (age > o.age) return 1;
            return 0;
        }
    }
}
