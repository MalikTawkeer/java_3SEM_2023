// COPY CONSTRUCTOR

public class CopyConstructor {

    int a;
    int b;
    int c;

    
    CopyConstructor(int x,int y, int z){
        a = x;
        b = y;
        c = z;
    }

    //copy constructor
    CopyConstructor(CopyConstructor copyConstructor)
    {
        a = copyConstructor.a;
        b = copyConstructor.b;
        c = copyConstructor.c;
    }    

    void show()
    {
        System.out.println(" "+a+" "+b+" "+c);
    }
}

class main4{
    public static void main(String[] args) {
        
        CopyConstructor copyConstructor = new CopyConstructor(1,2,3);
        copyConstructor.show();

        CopyConstructor copyConstructor2 = new CopyConstructor(copyConstructor);
        copyConstructor2.show();

    }
}
