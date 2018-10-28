import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int n = sca.nextInt();
        int a1 = sca.nextInt();
        int a2 = sca.nextInt();
        int a3 = sca.nextInt();
        int r = (n-(a1*15+a2*20+a3*30)),one,five,fifty;
        if (r>=0)
        {
            fifty = r/50;
            r = r%50;
            five = r/5;
            one = r%5;
            System.out.println(one+"\n"+five+"\n"+fifty);
        }
        else
        {
            System.out.println(0);
        }
    }
}
