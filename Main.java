package learn.com;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the table number you want to print:");
        int num = sc.nextInt();
        System.out.println("Till what number multiplication :");
        int mul = sc.nextInt();

        int f;
        for(int i = 1 ; i<mul+1 ; i++){
            f=i*num;
            System.out.println(num + "*" + i + "=" + f );
        }

    }
}