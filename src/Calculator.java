public class Calculator {
    public static void main(String[] args) {
        int age = 3;
        double weight = 8.2;
        boolean adult = false;
        char gender = 'f';
        String name = "Lisa";

        System.out.println("The persons name is " +name+ " and she is " +age+ " years old.");
        System.out.println("The persons gender is " +gender+ " and the weight is " +weight+ " kg.");
        System.out.println("Is the person an adult? " +adult);

        int a = 2;
        int b = 4;

        int addResult = add(a, b);
        printResult(addResult);

        int subResult = sub(a, b);
        printResult(subResult);

        int mulResult = mul(a, b);
        printResult(mulResult);

        int divResult = div(a, b);
        printResult(divResult);

        int modResult = mod(a, b);
        printResult(modResult);

    }

    public static int add(int a, int b){
        return a + b;
    }

    public static int sub(int a, int b){
        return a - b;
    }

    public static int mul(int a, int b){
        return a*b;
    }

    public static int div(int a, int b){
        return a/b;
    }

    public static int mod(int a, int b){
        return b%a;
    }

    public static void printResult(int result){
        System.out.println("The result is: "+result);
    }

}
