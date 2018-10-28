import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int p = sca.nextInt();
        if (p<=120)
        {
            System.out.println(p*2.10f);
            System.out.println(p*2.10f);
        }
        else if (p>121&&p<=330)
        {
            p=p-120;
            System.out.println(120*2.10f+p*3.02f);
            System.out.println(120*2.10f+p*2.68f);
        }
        else if (p>331&&p<=500)
        {
            p=p-330;
            System.out.println(120*2.10f+210*3.02f+p*4.39f);
            System.out.println(120*2.10f+210*2.68f+p*3.61f);
        }
        else if (p>501&&p<=700)
        {
            p=p-500;
            System.out.println(120*2.10f+210*3.02f+170*4.39f+p*4.97f);
            System.out.println(120*2.10f+210*2.68f+170*3.61f+p*4.01f);
        }
        else
        {
            p=p-700;
            System.out.println(120*2.10f+210*3.02f+170*4.39f+200*4.97f+p*5.63f);
            System.out.println(120*2.10f+210*2.68f+170*3.61f+200*4.01f+p*4.50f);

        }
    }
}
