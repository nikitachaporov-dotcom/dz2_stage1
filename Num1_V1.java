import java.util.Scanner;

public class Num1_V1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int in = input.nextInt();
        System.out.println(in >= 3  ?  (in <= 8 ? true : false): false);
    }
}

