import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        float litter = sca.nextFloat();
        float a1= (float)(Math.round(litter*10*0.26418))/10;
        System.out.println(a1);
    }
}
