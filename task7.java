import java.util.Scanner;
public class task7 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n + 1; i++) {
            int mx = -99999999;
            for(int j = 0; j < i; j++){
               int a = sc.nextInt();
               System.out.print(a);
               if(a > mx){
                   mx = a;
               }
            }
            System.out.println(mx);
            sum += mx;

        }
        //System.out.println(sum);
    }
}