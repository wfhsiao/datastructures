
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Read7000words {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://einstein.nptu.edu.tw:9212/sources/datastructure/StudentWebs/data/7000words_difficult.txt");
            URLConnection conn = url.openConnection();
            conn.setConnectTimeout(3000);
            Scanner scan = new Scanner(conn.getInputStream());            
            System.out.print("檔案內容:\n");           
            
            String header = scan.nextLine();  // 檔案內容第一行為標題, 不做分解
            System.out.println(header);
            
            while (scan.hasNextLine())
            {
                String line = scan.nextLine();                
                String strs[] = line.split("\t");
                System.out.println(strs[1]);
//                int p = strs[1].lastIndexOf(".");
//                if (p<0)
//                    System.out.println(strs[0]+","+strs[1]);
//                else {
//                    String tmp[]=strs[1].substring(0, p+1).split("/");
//                    for (String s : tmp) {
//                        set.add(s);
//                    }   
//                    
//                }   
//                
//        
            }
        } catch (Exception ex) {
            System.out.printf("檔案開啟錯誤:%s\n", ex.getMessage());
        }
    }
}
