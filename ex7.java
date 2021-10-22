import java.util.Scanner;

public class ex7 {
    
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        //임의의 숫자를 무한히 입력받겠다, 그리고 그 숫자를 전부 더하겠다.
        //단, 임의의 숫자가 0인 경우 반복을 멈추겠다.
        
        int sum = 0;
        int num = 0;
        while(true)
        {
            num = scan.nextInt();
            if(num == 0)
                break;
            sum += num;
        }

        System.out.println(sum);
    }
}

