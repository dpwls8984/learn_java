
public class ex6 {
    public static void main(String [] args) {
        double pi = 3;
        for(int i = 1; i<=15; i++)
        {
            if(i%2 != 0)
            {
                pi += 4.0 / (double)((2*i) * (2*i+1) * (2*i+2));
            }
            else
            {
                pi -= 4.0 / (double)((2*i) * (2*i+1) * (2*i+2));
            }
        }

        System.out.println(pi);
    }
}