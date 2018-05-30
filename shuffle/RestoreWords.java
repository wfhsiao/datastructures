
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class RestoreWords {
    public static void main(String[] args) {
        try {
            File f = new File("english.words");
            Scanner scan = new Scanner(f);
            ArrayList<String> words = new ArrayList<>();
            while (scan.hasNextLine()) {
                words.add(scan.nextLine());
            }
            scan.close();
            String [] newwords = process(words);
            print(newwords);
        } catch (FileNotFoundException ex) {
            System.out.printf("Reading file error: %s\n", ex.getMessage());
        }
        
    }

    private static String [] process(ArrayList<String> words) {
        String [] newwords = new String [words.size()];
        for (int i = 0; i < words.size(); i++) {
            String w = words.get(i);
            String p1 = w.substring(0, 1);
            String p2 = w.substring(1);
            char c = p1.charAt(0); // '0'-'9', 'A'-'Z'
            int cnt = 0;
            if (c<='9')
                cnt = c - '0';
            else if (c >= 'A' && c <= 'Z')
                cnt = c - 'A' + 10;
            
            if (cnt > 0)
                newwords[i] = newwords[i-1].substring(0, cnt)+p2;
            else
                newwords[i] = p2;
//            System.out.println(i);
        }
        return newwords;
    }

    private static void print(String[] newwords) {
        for (int i = 0; i < newwords.length; i++) {
            System.out.println(newwords[i]);
        }
    }
}
