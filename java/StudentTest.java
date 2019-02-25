
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class StudentTest {
    public static void main(String[] args) {
        try {
            //        Student s = new Student("106406001", "張三", 20);
//        System.out.printf("s=%s\n", s);
            File f = new File("20160330students.txt");
            Scanner s = new Scanner(f);
            Student students[] = new Student [68];
            int i = 0;
            s.nextLine(); // 跳過標題行
            while (s.hasNextLine()) {
                String line = s.nextLine();
                String tmps[] = line.split("\\t");
                students[i] = new Student(tmps[0], tmps[1], Integer.valueOf(tmps[2]));
                i++;
            }
            
            Student.setCol(1);            
            Arrays.sort(students);
            System.out.println("================依姓名==========================");
            print(students);
            Student.setCol(2);            
            Arrays.sort(students);
            System.out.println("================依年齡==========================");
            print(students);
            Student.setCol(0);            
            Arrays.sort(students);
            System.out.println("================依學號==========================");
            print(students);
        } catch (FileNotFoundException ex) {
            System.out.printf("檔案開啟失敗: %s\n", ex.getMessage());
        }

    }

    private static void print(Student[] students) {
        for (Student s : students) {
            System.out.println(s);
        }
    }
}
