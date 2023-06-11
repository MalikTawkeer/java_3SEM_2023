public class classDemo {
    int a,b;

    void getValues(int a, int b){
        this.a= a;
        this.b=b;
    }
    void display()
    {
        System.out.println(" "+a+" "+b);
    }

    public static void main(String[] args) {
        classDemo classDemo = new classDemo();
        classDemo.getValues(12, 23);
        classDemo.display();
    }
}
