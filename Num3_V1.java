import java.util.Scanner;

public class Num3_V1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int in = input.nextInt();
        boolean preRes1 = (in >= -2 && (in <= 3));
        boolean preRes2 = (in >= 6 && (in <= 9));
        boolean res = preRes1 || preRes2;

        System.out.println(!res);
    }
}

