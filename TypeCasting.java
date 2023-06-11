public class TypeCasting {
    public static void main(String[] args) {
        int a=9;
        double b;

        //widening casting (small into large datatype)
        b=a;
        System.out.println(" Before "+ a); // brfore tycasting
        System.out.println("After "+b); // after type casting


        // narrowing casting (large into small datatype)
        double x=9.22;
        int y;

        y = (int) x;

        System.out.println("Before "+x);
        System.out.println("After "+y);

    }
}
