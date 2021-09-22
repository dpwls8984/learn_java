import java.util.Scanner;
public class program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        System.out.println("사용자 입력 변수 값은? " + num);
        scan.close();
    }
}
