import java.util.Scanner;
public class program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int target_score = 80;
        System.out.println("점수는? ");
        int cp = scan.nextInt();

        if(cp < target_score)
        {
            System.out.println("불합격");
        }
        else
        {
            System.out.println("합격!");
        }
    }
}
