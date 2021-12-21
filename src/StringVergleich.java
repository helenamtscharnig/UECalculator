public class StringVergleich {
    public static void main(String[] args) {
        String one = "three";
        String two = "three";

        System.out.println(one == two);
        System.out.println(one.equals(two));

        //bei Ausgabe beide 'true', weil IDE smart ist und für uns arbeitet.

    }
}
