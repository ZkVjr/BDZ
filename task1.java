import java.util.Scanner;
public class task1 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cnt = 0;
        if(n % 10 != 0){
            cnt = 1;
        }
        while(n > 0){

            if((cnt == 1 && n % 10 == 0) || (n % 10 != 0)){
                System.out.print(n % 10);
            }
            n /= 10;
        }
    }
    //     ／＞　 フ
    //   | 　_　_|
    // ／` ミ＿xノ
    //／　　　　 |
    //(　 ヽ　 つ
    //  ＼二)
}