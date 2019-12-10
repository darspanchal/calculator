public class calculator {

    int a = 10;
    static int b = 20;

    public void m1() {
        System.out.println(a);
        System.out.println(b);
    }

    public static void addition() {
        int c = 100;
        System.out.print("Addition of " + c + " and " + b + " =");
        System.out.println(c + b);
    }

    public static void subtraction(int a, int b) {
        System.out.print("Subtraction of " + a + " and " + b + " =");
        System.out.println(a - b);
    }
    //No return type - WITH STATIC Parmeter Method
    public static void division() {
        int a = 30;
        System.out.print("division of " + a + " and " + b + " = ");
        System.out.println(a / b);
    }
    //No return type - WITH STATIC Parmeter Method
    public static void multiplication () {
        int b = 20;
        System.out.print("Multiplication of  "+b+" and "+b+" = ");
        System.out.println(b*b);
    }

    public static void main(String[] args) {
        String company = "TFL";
        System.out.println(company);
        subtraction(20,10);
        addition();
        division();
        multiplication();
        System.out.print(b);
    }

}