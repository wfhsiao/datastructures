
import java.awt.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author user
 */
public class MyMaze {
    static Point start, end;
    static int row, col;
    public static void main(String[] args) {
        try {
            File file = new File("mazedata2.txt");
            Scanner scan = new Scanner(file);
//            String line = scan.nextLine();
//            String str[]= line.split(" ");
            row = scan.nextInt();
            col = scan.nextInt();
//            System.out.printf("row=%d, col=%d\n", row, col);
            int [][] maze = new int[row][col];
            readMaze(scan, maze);
            start= setPoint(maze, "起始");
            end= setPoint(maze, "結束");
            showMaze(maze);
            if (findPath(maze))
                showMaze(maze);
            else
                System.out.println("找不到可行的路徑.");
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
                    case 0: if (start.x==i && start.y==j) 
                               System.out.print("Ｓ");
                            else if (end.x==i && end.y==j) 
                                System.out.print("Ｅ");
                            else
                                System.out.print("　");
                            break;
                    case 1: System.out.print("．");
                            break;
                    case 2: System.out.print("□");
                            break;
                    case 3: System.out.print("ｘ");
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
        
//        maze[r][c] = -1;
        return new Point(r, c);
        
    }

    // Here we write a Maze class that have methods to initialize the map (read from file)
    // and showMap(), setStart(), setEnd(), showPath(), and findPath()
    // where setStart, setEnd, and findPath are of type boolean
    public static boolean findPath(int [][] maze) {
        int total_dirs = 4;
        Point dirs[] = new Point[total_dirs]; // 方向
        for (int i = 0; i < total_dirs; i++) {
            dirs[i] = new Point();
        }
        // note: 此處的 x 對應的是row, 而 y 對應的是 col
        dirs[0].x = 0;        dirs[0].y = 1; // 右
        dirs[1].x = 1;        dirs[1].y = 0; // 下 
        dirs[2].x = 0;        dirs[2].y = -1; // 左
        dirs[3].x = -1;       dirs[3].y = 0;  // 上

        // essential codes for maze
        Stack<Point> stack = new Stack<>();
        Point here = start;
        int option = 0;
        while (!here.equals(end)) {
            Point newPos = null;
            while (option < total_dirs) {
                newPos = new Point(here.x+dirs[option].x, here.y+dirs[option].y); //go to next direction

                // if this point is feasible
                if (newPos.x < row && newPos.y < col
                    && maze[newPos.x][newPos.y] == 0) break;

                option++;
            }

            if (option < total_dirs) { // if we've got a feasible point
                maze[here.x][here.y] = 1; // 可能的路徑
                stack.push(here); // push the current pos to stack
                here = newPos; // and move to next pos
                option = 0;
            } else { // if we cannot go anywhere from here
                if (stack.isEmpty())  return false; // oh-oh, failed!
                maze[here.x][here.y] = 3; // 沒路了, 要回頭
                Point back = stack.pop(); // get back a pos
                if (here.x == back.x) 
                    option = 2 + back.y - here.y;
                else 
                    option = 3 + back.x - here.x;

                here = back;
            }
        }
        return true;
    }	        
}