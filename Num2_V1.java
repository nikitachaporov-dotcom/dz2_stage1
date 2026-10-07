import java.util.Scanner;

public class Num2_V1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int in = input.nextInt();
        boolean preRes1 = (in >= -3 && (in <= 5));
        boolean preRes2 = (in >= 8 && (in <= 15));
        boolean res = preRes1 || preRes2;

        System.out.println(res);
    }
}

