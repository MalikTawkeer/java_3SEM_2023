import java.util.Scanner;

public class addTwoNumbers {
    public static void main(String[] args) {
        int a,b,sum ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Two Numbers: ");
        a=scanner.nextInt();
        b=scanner.nextInt();
        sum = a+b;
        System.out.println("Sum Of two numbers:-  " +sum);
        

    }
}
