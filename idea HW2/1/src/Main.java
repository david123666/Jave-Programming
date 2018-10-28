import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        float mile = sca.nextFloat();
        float km = (float)(Math.round(mile*100*1.6))/100;
        System.out.println(km);
    }
}
