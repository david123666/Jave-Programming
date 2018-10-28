import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int x = sca.nextInt();
        int y = sca.nextInt();
        if (x*x+y*y<=100*100)
        {
            System.out.println("inside");
        }
        else
        {
            System.out.println("outside");
        }
    }
}
