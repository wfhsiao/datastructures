
import java.awt.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class MyMaze {
    static Point start, end;
    public static void main(String[] args) {
        try {
            File file = new File("mazedata2.txt");
            Scanner scan = new Scanner(file);
//            String line = scan.nextLine();
//            String str[]= line.split(" ");
            int row = scan.nextInt();
            int col = scan.nextInt();
//            System.out.printf("row=%d, col=%d\n", row, col);
            int [][] maze = new int[row][col];
            readMaze(scan, maze);
            start= setPoint(maze, "起始");
            end= setPoint(maze, "結束");
            showMaze(maze);
        } catch (FileNotFoundException ex) {
            System.out.printf("error in opening file: %s\n", ex.getMessage());
        }
        
    }

    private static void readMaze(Scanner scan, int[][] maze) {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                maze[i][j] = scan.nextInt();                
            }            
        }        
    }

    private static void showMaze(int[][] maze) {
        for (int i = 0; i < maze.length; i++) {
            for (int j = 0; j < maze[i].length; j++) {
                switch (maze[i][j])
                {
                    case -1:if (start.x==i && start.y==j) 
                               System.out.print("Ｓ");
                            else if (end.x==i && end.y==j) 
                                System.out.print("Ｅ");
                            break;
                    case 0: System.out.print("　");
                            break;
                    case 2: System.out.print("□");
                            break;
                }
            }            
            System.out.println();
        } 
    }

    private static Point setPoint(int[][] maze, String msg) {
        Scanner scan = new Scanner(System.in);
        int r, c;
        while (true) {
            System.out.printf("請輸入%s點座標: ", msg);
            r = scan.nextInt();
            c = scan.nextInt();
            if (maze[r][c] == 0) break;
        }
        
        maze[r][c] = -1;
        return new Point(r, c);
        
    }
}