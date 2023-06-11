public class OverloadingMainMethod {

    public static void main(int a, int b) {
        System.out.println("main2: "+(a+b));
    }

    public static void main(boolean flag){
        System.out.println(" "+flag);
    }


    // WE CAN CALL OVERIDED METHODS INTO MAIN METHOD

    public static void main(String[] args) {
        System.out.println("Main method");

        OverloadingMainMethod overloadingMainMethod = new OverloadingMainMethod();
        overloadingMainMethod.main(true);
        overloadingMainMethod.main(1,3);
        //overloadingMainMethod.main("malik");
    }
}