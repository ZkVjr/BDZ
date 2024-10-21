import java.util.Scanner;
import java.util.Arrays;
public class task9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        char[] a = n.toCharArray();
        Arrays.sort(a);
        do {
            if (a[0] != '0'){
                System.out.print(new String(a) + " ");
            }
            int s = a.length;
            int i = s - 1;
            while(i > 0 && a[i - 1] >= a[i]){
                i--;
            }
            if(i <= 0){
                break;
            }
            int j = s - 1;
            while(a[j] <= a[i - 1]){
                j--;
            }
            char c = a[i - 1];
            a[i - 1] = a[j];
            a[j] = c;
            j = s - 1;
            while(i < j){
                c = a[i];
                a[i] = a[j];
                a[j] = c;
                i++;
                j--;
            }
        } while(true);
    }
}