import java.io.*;

public class book {
    public static void main(String[] args) throws IOException
    {
       System.out.println("정수 2개를 입력하십시오.");

       BufferedReader br = 
        new BufferedReader(new InputStreamReader(System.in));

        String str1 = br.readLine();
        String str2 = br.readLine();

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

        System.out.println(num1 + "(이)가 입력되었습니다.");
        System.out.println("그 다음으로, " + num2 + "(이)가 입력되었습니다." );
    }
}
