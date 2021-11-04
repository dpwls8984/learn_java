public class program {

    public static void main(String[] args) {
        //주사위의 합이 4의 배수인 경우 출력
        int sum = 0;
        for(int i = 1;i<7;i++)
        {
            for(int j = 1;j<7;j++)
            {
                sum = i + j;
                if(sum % 4 == 0)
                {
                    System.out.println(i + ", " + j);
                }
            }
        }
    }
}