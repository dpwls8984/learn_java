import java.util.Scanner;
public class program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int max;
        if (a >=  b &&  a >=  c)
        {
            max =  a;
        }
        else if ( b >=  a &&  b >= c)
        {
            max =  b;
        }
        else
        {
            max =  c;
        }
        System.out.println("가장 큰 수는 " + max + "입니다.");
    }
}