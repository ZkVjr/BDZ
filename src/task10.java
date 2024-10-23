import java.util.Scanner;

public class task10{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String x = sc.nextLine();
        
        int i = 0, j = 0;
        int[] a = new int[s.length()];
        int[] b = knut(x);
        
        int cnt = 0;
        while(i < s.length()){
            if(s.charAt(i) == x.charAt(j)){
                i++;
                j++;
            }
            if(j == x.length()){
                a[cnt] = i - j;
                cnt++;
                j = b[j - 1];
            } else if(i < s.length() && x.charAt(j) != s.charAt(i)){
                if(j != 0){
                    j = b[j - 1];
                } else{
                    i++;
                }
            }
        }


        if(cnt == 0){
            System.out.println("-1");
        } else{
            for(int k = 0; k < cnt; k++){
                System.out.print(a[k] + " ");
            }
        }
    }

    public static int[] knut(String x){
        int[] ans = new int[x.length()];
        int l = 0;
        ans[0] = 0;

        for(int i = 1; i < x.length(); i++){
            if (x.charAt(i) == x.charAt(l)){
                l++;
                ans[i] = l;
                i++;
            } else{
                if(l != 0) {
                    l = ans[l - 1];
                } else{
                    ans[i] = 0;
                    i++;
                }
            }
        }
        return ans;
    }
    //     Кнут
    //      __
    //     /  \
    //    |    |
    //     \__/
    //       |
    //       |
    //       |
    //       |
    //       |
    //       |
    //       |
    //      / \
    //     /   \
    //    /     \
    //
    //    Пряник
    //     .--.
    //   .'_\/_'.
    //   '. /\ .'
    //     "||"
    //      ||
}