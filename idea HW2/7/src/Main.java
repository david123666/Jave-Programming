import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        float g = sca.nextFloat();
        float t = (float)(Math.round(g/600*10))/10;
        System.out.println(t);
    }
}
