import java.util.Scanner;
public class task6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        while(b != 0){
            int ans = (a & b) << 1;
            int sum = a ^ b;
            a = sum;
            b = ans;
        }
        System.out.println(a);
    }
}