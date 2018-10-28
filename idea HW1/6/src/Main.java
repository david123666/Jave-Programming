import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        float v1 = sca.nextFloat();
        float v2 = sca.nextFloat();
        float v3 = sca.nextFloat();
        if ((v1%4==0&&v1%100!=0 )||(v1%400 ==0))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
        if ((v2%4==0&&v2%100!=0 )||(v2%400 ==0))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
        if ((v3%4==0&&v3%100!=0 )||(v3%400 ==0))
        {
            System.out.println("true");
        }
        else
        {
            System.out.println("false");
        }
    }
}
