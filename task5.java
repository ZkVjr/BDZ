import java.util.Scanner;
public class task5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt(), m = sc.nextInt(), y = sc.nextInt(), h;
        if(m < 3){
            m += 12;
            y--;
        }
        int k = Math.floorMod(y, 100), J = y / 100;
        h = Math.floorMod(q + ((m + 1) * 13) / 5 + k + k / 4 + J / 4 - J * 2, 7);

        switch (h){
            case (0):
                System.out.println("Saturday");
                break;
            case (1):
                System.out.println("Sunday");
                break;
            case (2):
                System.out.println("Monday");
                break;
            case (3):
                System.out.println("Tuesday");
                break;
            case (4):
                System.out.println("Wednesday");
                break;
            case (5):
                System.out.println("Thursday");
                break;
            case (6):
                System.out.println("Friday");
                break;
        }
    }
    //         /\
    //        /__\
    //       |    |
    //      _|____|_
    //     |        |
    //     |  [] [] |
    //     |        |
    //     |________|
}