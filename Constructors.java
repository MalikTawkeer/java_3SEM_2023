public class Constructors {
    
    static{
        System.out.println("this is static-1");
    }

    int a;
    int b;
    int c;

    Constructors(int a,int b,int c){
        this.a = a;
        this.b = b;
        this.c = c;
        System.out.println(""+a+" "+b+" "+c);
    }

    

}

class main2{

    public static void main(String[] args) {
        Constructors cons = new Constructors(1, 2, 3);
    }
}
