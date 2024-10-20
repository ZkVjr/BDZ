import java.util.Scanner;
public class task1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n > 0){
            if(n % 10 != 0){
                System.out.print(n % 10);
            }
            n /= 10;
        }
    }
}