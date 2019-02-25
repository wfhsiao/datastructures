
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author student1004
 */
public class TrainCar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String cars_str = scan.nextLine();
        String cars[]= cars_str.split("\\s+");
        System.out.println(Arrays.toString(cars));
        reverse(cars);
        System.out.println(Arrays.toString(cars));
        process(cars);
    }

    private static void reverse(String[] cars) {
        for (int i = 0; i < cars.length/2; i++) {
            String car = cars[i];
            cars[i]= cars[cars.length-1-i];
            cars[cars.length-1-i] = car;
        }
    }

    private static void process(String[] cars) {
        int [] nCars = new int [cars.length];
        for (int i = 0; i < nCars.length; i++) {
            nCars[i] = Integer.parseInt(cars[i]);            
        }
        int currentNo = 1, maxSize;
        ArrayList<Stack<Integer>> railroads = new ArrayList<>();
        for (int i = 0; i < nCars.length; i++) {
            if (currentNo == nCars[i]) {
                System.out.printf("直接從來源輸出車廂%d\n", currentNo);
                currentNo++;
                outPut(currentNo, railroads);
            } else {
                push2Buffer(nCars[i], railroads);
                if (maxSize < railroads.size()) maxSize = railroads.size();
            }            
        }
        System.out.printf("本題所需的緩衝鐵軌數為%d\n", maxSize);
    }
    
}
