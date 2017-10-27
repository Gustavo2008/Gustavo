package E1004;
import java.util.Scanner;

public class Main {
	public static void main(String[]args){
        Scanner d = new Scanner(System.in);
        int a = d.nextInt();
        int b = d.nextInt();
        int PROD = a * b;
        System.out.printf("PROD = %.1f\n"+ PROD);
    }
}