import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int cm = sca.nextInt();
        int kg = sca.nextInt();
        System.out.println((double)cm/2.54);
        System.out.println((double)kg/0.454);
    }
}
