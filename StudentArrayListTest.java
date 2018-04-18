
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class StudentArrayListTest {
    public static void main(String[] args) {
        try {
            //        Student s = new Student("106406001", "張三", 20);
//        System.out.printf("s=%s\n", s);
            File f = new File("20160330students.txt");
            Scanner s = new Scanner(f);
//            Student students[] = new Student [68];
            ArrayList<Student> aL= new ArrayList<>();            
//            int i = 0;
            s.nextLine(); // 跳過標題行
            while (s.hasNextLine()) {
                String line = s.nextLine();
                String tmps[] = line.split("\\t");
//                students[i] = new Student(tmps[0], tmps[1], Integer.valueOf(tmps[2]));
                aL.add(new Student(tmps[0], tmps[1], Integer.valueOf(tmps[2])));
//                i++;
            }
            
            System.out.println("================依姓名==========================");
            Student.setCol(1);            
            Collections.sort(aL);
            print(aL);
            System.out.println("================依年齡(降冪)==========================");
            Student.setCol(2); 
            Collections.sort(aL, Collections.reverseOrder());
            print(aL);
            System.out.println("================依學號==========================");
            Student.setCol(0);            
            Collections.sort(aL);
            print(aL);
        } catch (FileNotFoundException ex) {
            System.out.printf("檔案開啟失敗: %s\n", ex.getMessage());
        }

    }

    private static void print(Student[] students) {
        for (Student s : students) {
            System.out.println(s);
        }
    }

    private static void print(ArrayList<Student> aL) {
        for (Student s : aL) {
            System.out.println(s);
        }
    }
}
