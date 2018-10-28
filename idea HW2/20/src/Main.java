import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int y =sca.nextInt();
        if (y%400==0)
        {
            System.out.println("Bissextile Year");
        }
        else if (y%100==0)
        {
            System.out.println("Common Year");
        }
        else if (y%4==0)
        {
            System.out.println("Bissextile Year");
        }
        else
        {
            System.out.println("Common Year");
        }
    }
}
