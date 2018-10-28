import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int v1 = sca.nextInt();
        int v2 = sca.nextInt();
        System.out.println(v1+"+"+v2+"="+(v1+v2));
        System.out.println(v1+"*"+v2+"="+(v1*v2));
        System.out.println(v1+"-"+v2+"="+(v1-v2));
        System.out.println(v1+"/"+v2+"="+(v1/v2)+"..."+(v1%v2));
    }
}
