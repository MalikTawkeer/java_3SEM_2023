public class ConstructorOverloading {
    
    double length;
    double bredth;
    double height;

    ConstructorOverloading(){
        System.out.println("empty constructor");
    }

    ConstructorOverloading(double length,double bredth,double height)
    {
        this.length = length;
        this.bredth = bredth;
        this.height = height;
    }

    ConstructorOverloading(int a,int b)
    {
        System.out.println("sum: "+(a+b));
    }

    double volume()
    {
        return length*bredth*height;
    }

}

class main3{

    public static void main(String[] args) {
        
        // three parameters
        ConstructorOverloading constructorOverloading = new ConstructorOverloading(10.2, 11.3, 35.3);
        System.out.println("volume is : "+constructorOverloading.volume());

        // two parameters
        ConstructorOverloading constructorOverloading2 = new ConstructorOverloading(10,20);

        // no parameter
        ConstructorOverloading constructorOverloading3 = new ConstructorOverloading();

    }

}
