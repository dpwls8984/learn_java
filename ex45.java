import java.util.Scanner;

public class ex45 {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        year = year - 2000;

        switch(year%12)
        {
        case 0:
            System.out.println("dragon"); break;
        case 1:
            System.out.println("snake"); break;
        case 2:
            System.out.println("horse"); break;
        case 3:
            System.out.println("sheep"); break;
        case 4:
            System.out.println("monkey"); break;
        case 5:
            System.out.println("rooster"); break;
        case 6:
            System.out.println("dog"); break;
        case 7:
            System.out.println("pig"); break;
        case 8:
            System.out.println("rat"); break;
        case 9:
            System.out.println("ox"); break;
        case 10:
            System.out.println("tiger"); break;
        case 11:
            System.out.println("hare"); break;
        default:
            System.out.println("wrong input");
        }
    }
}
