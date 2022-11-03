public class VergleichVonArraysTest {

    public static void main(String[] args) {

        int[] a = {3,5,1,3};
        int[] b = {1,5,3,3};

        VergleichVonArrays vergleichVonArrays = new VergleichVonArrays();
        System.out.println(vergleichVonArrays.isEqual(a, b));
    }

}