import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String c2 =sca.next();
        int v1 = Integer.valueOf(c2,16);
        System.out.println((char)v1);
    }
}
