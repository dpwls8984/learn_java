import java.util.Scanner;
public class program {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int target_price = 70000;
        System.out.println("현재 주가는?");
        int cp = scan.nextInt();

        System.out.println("통장 잔고는?");
        int balance = scan.nextInt();

        // 만약 cp < target_price 이면 만약 balance >= cp 이면 매수
        // 아니면 관망 그리고 아니면 관망
        // 만약 cp < target_price 이고 그리고 balance >= cp이면 매수
        // 아니면 관망

        if (cp < target_price && balance >= cp)
            System.out.println("매수!");
        else
            System.out.println("관망!");

//        if(cp < target_price)
//        {
//            if(balance >= cp)
//                System.out.println("매수!");
//            else 
//                System.out.println("관망!");
//        }
//        else
//        {
//            System.out.println("관망!");
//        }
    }
}
