public class CompareOperator {
    public static void main(String[] args) {
        int x =10;
        int y =10;

        System.out.println("Czy X jest wiekszy niz Y");
        boolean isXGreaterThenY = x < y;
        System.out.println(isXGreaterThenY);

        boolean xEqualsY = x != y;
        System.out.println("Czy x jest rozne y");
        System.out.println(xEqualsY);
        System.out.println(!xEqualsY);
    }
}
