import java.util.Scanner;

public class program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        
        for(int j = 0;j<num;j++)
        {
            for(int i = 0;i<j+1;i++)
                System.out.print("*");
            System.out.println();
        }
    }
}