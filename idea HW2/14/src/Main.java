import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int h = sca.nextInt();
        int t = sca.nextInt();
        float m1 = (float)(Math.round(h-80)*10*0.7)/10;
        float m2 = (float)(Math.round(h-70)*10*0.6)/10;
        if (t==1)
        {
            System.out.println(m1);
        }
        else
        {
            System.out.println(m2);
        }
    }
}
