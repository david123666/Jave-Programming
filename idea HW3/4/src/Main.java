import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int i,v1=0;
        for (i=a;i<=b;i++)
        {
            if (i%2==0)
            {
                v1=v1+i;
            }
        }
        System.out.println(v1);
    }
}
