import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int v1 =sca.nextInt();
        int v2 =sca.nextInt();
        int v3 =sca.nextInt();
        if (v1<=v2&&v2<=v3&&v1<=v3)
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
