import java.util.Scanner;
public class task2 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int cnt = 0;
        for(int i = 0; i < s.length() - 1; i++){
            cnt++;
            if(s.charAt(i) != s.charAt(i + 1)){
                System.out.print(s.charAt(i));
                System.out.print(cnt);
                cnt = 0;

            }
            if(i + 1 == s.length() - 1){
                System.out.print(s.charAt(i + 1));
                System.out.print(cnt + 1);
            }
        }
    }
}