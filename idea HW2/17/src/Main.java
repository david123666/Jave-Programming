import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int h1 = sca.nextInt();
        int m1 = sca.nextInt();
        int h2 = sca.nextInt();
        int m2 = sca.nextInt();
        int m  = (h2*60+m2)-(h1*60+m1);
        int money;
        if (m<120)
        {
            money = (m/30)*30;
        }
        else if (m<240)
        {
            m = m-120;
            money = 120+(m/30)*40;
        }
        else
        {
            m = m-240;
            money = 120+160+(m/30)*60;
        }
        System.out.println(money);
    }
}
