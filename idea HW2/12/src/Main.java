import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        float r = sca.nextFloat();
        float h = sca.nextFloat();
        System.out.println((double)r*r*Math.PI*h);

    }
}
