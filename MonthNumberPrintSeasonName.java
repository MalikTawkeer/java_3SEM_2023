import java.util.Scanner;

public class MonthNumberPrintSeasonName {
    public static void main(String[] args) {
        
        int a;
        System.out.println("Enter Month Number: ");
        Scanner scanner = new Scanner(System.in);
        a=scanner.nextInt();

        if(a == 12 || a==1 || a==2)
        {
            System.out.println("Winter ");
        }else if(a>=3 && a<=5)
        {
            System.out.println("Summer ");
        }else if(a>=6 && a<=9)
        {
            System.out.println("Moonsoon");
        }else if(a>=10 && a<=11)
        {
            System.out.println("Autmn");
        }
        
        // using sswitch
        switch(a){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
        }
    }
}
