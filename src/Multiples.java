public class Multiples {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 1; i <= 100; i++) {
            if ((i % 3 == 0) || i % 5 == 0) {
                num += 1;
            }
        }
        System.out.println(num);
    }
}
