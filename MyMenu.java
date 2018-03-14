
import java.util.Scanner;

/**
 *
 * @author user
 */
public class MyMenu {
    
    public static void main(String[] args) {
        int c = getMenu();
        System.out.printf("您選擇的是%d\n", c);
    }

    private static int getMenu() {
        Scanner scan = new Scanner(System.in);
        int choice=0;
        while (true) {
            System.out.println("-------------菜單-----------------");
            System.out.println("1.宮保雞丁 -----------------NT$250");
            System.out.println("2.韭菜雞蛋 -----------------NT$150");
            System.out.println("3.鳳梨蝦球 -----------------NT$300");
            System.out.println("4.清蒸鱸魚 -----------------NT$300");
            System.out.println("5.炸銀絲捲 -----------------NT$150");
            System.out.print("請輸入您的選擇(1-5): ");
            try {
                choice = scan.nextInt();
                if (choice < 1 || choice > 5) System.out.println("範圍錯誤, 請重新輸入.");
                else
                    break;    
            } catch (Exception e) {
                System.out.printf("輸入錯誤: %s\n", e.getMessage());
                scan = new Scanner(System.in);
            }
            
        }
        return choice;
    }
}
