public class FindEven {
    public static void main(String[] args) {

        int a = 0;

        while(a++ <= 10){
            if (a%2 == 0){
            System.out.println(a);}
        }

        for(int i = 1; i < 10; i++){
            System.out.println(i);
        }

        for(int i = 10; i >= 0; i--){
            System.out.println(i);
        }

        for(int i = 20; i <= 90; i = i+5){
            System.out.println(i);
        }
    }
}
