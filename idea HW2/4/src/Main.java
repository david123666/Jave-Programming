import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int C = sca.nextInt();
        int E = sca.nextInt();
        int M = sca.nextInt();
        System.out.println(C+E+M);
        System.out.println((C+E+M)/3);
    }
}
