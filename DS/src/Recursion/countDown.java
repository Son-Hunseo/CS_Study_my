package Recursion;

public class countDown {

    public static void main(String[] args) {

        countDown(3); //출력 결과 : 3 2 1

    }

    public static void countDown (int integer) {
        System.out.println(integer);
        if (integer > 1) {
            countDown(integer - 1);
        }
    }

}
