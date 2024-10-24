import java.util.Arrays;
import java.util.Scanner;
public class task4 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        char[] cha = a.toCharArray();
        char[] chb = b.toCharArray();
        for(int i = 0; i < a.length(); i++){
            if(cha[i] >= 'a' && cha[i] <= 'z'){
                cha[i] = (char) (cha[i] - 'a' + 'A');
            }
        }
        for(int i = 0; i < b.length(); i++){
            if(chb[i] >= 'a' && chb[i] <= 'z'){
                chb[i] = (char) (chb[i] - 'a' + 'A');
            }
        }

        Arrays.sort(cha);
        Arrays.sort(chb);


        if(Arrays.equals(cha, chb)){
            System.out.println("Yes");
        } else{
            System.out.println("No");
        }

    }
    //       \   |   /
    //        .-'-.
    //    -- (     )  --
    //        `-.-'
    //      /   |   \
}