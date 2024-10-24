import java.util.Scanner;
public class task8{
    public static void hanoi(int n, char a, char b, char c){
        if(n == 1){
            System.out.println("Move disk 1 from " + a + " to " + b);
            return;
        }
        hanoi(n - 1, a, c, b);
        System.out.println("Move disk " + n + " from " + a + " to " + b);
        hanoi(n - 1, c, b, a);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        hanoi(n, 'A', 'C', 'B');
    }
    //          |               |                |
    //         |||             |||              |||
    //        |||||           |||||            |||||
    //       |||||||         |||||||          |||||||
    //      |||||||||       |||||||||        |||||||||
    //     ==========       ==========       ==========
    //          A               B               C
}