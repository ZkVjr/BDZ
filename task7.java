import java.util.Scanner;
public class task7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][0];

        for(int i = 0; i < n; i++){
            a[i] = new int[i + 1];
            for(int j = 0; j < i + 1; j++){
                a[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
       for(int i = 0; i < n; i++){
           int mx = 0;
           for(int j = 0; j < i + 1; j++){
               if(a[i][j] > mx){
                   mx = a[i][j];
               }
           }
           sum += mx;
       }

        System.out.println(sum);
    }
    //       |
    //       /\
    //      |==|
    //      |  |
    //      |  |
    //     /____\
    //    |      |
    //    |  []  |
    //    |      |
    //    |  []  |
    //    |      |
    //    |______|
    //       |||
    //      /|||\
    //     / ||| \
}