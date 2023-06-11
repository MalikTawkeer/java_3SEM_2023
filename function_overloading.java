public class function_overloading {
    
    
    void add()
    {
        System.out.println(" no parameter");
    }

    void add(int a)
    {
        System.out.println("int parameter");
    }

    double add(double x,int a)
    {
        System.out.println("flaot parameter");
        return x;
    }

    int add(int a,int b,int c){
        return a+b+c;
    }


   
}

class main{
    public static void main(String[] args) {
        
        function_overloading fo = new function_overloading();
        fo.add();
        fo.add(10);
        fo.add(3.2,2);
        fo.add(1,2,3);
        System.out.println("sum of 3 no.s "+fo.add(1, 3, 3));
    }
}

