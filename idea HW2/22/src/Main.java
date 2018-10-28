import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int v1 = sca.nextInt();
        int v2 = sca.nextInt();
        int v3 = sca.nextInt();
        System.out.println(Math.max(Math.max(v1,v2),v3));
        System.out.println(Math.min(Math.min(v1,v2),v3));
    }
}
