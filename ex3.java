
public class ex3 {
    public static void main(String [] args) {
    //분산 = (xi - 평균)^2 / n분의 1
    int a = 2;
    int b = 4;
    int c = 6;
    int d = 8;

    int sum = a + b + c + d;
    int count = 4; //데이타는 4개이다
    double avg = (double)sum / (double)count;
    //double avg = sum / 4.0;

    double dsum = (a - avg)*(a - avg) + 
    (b - avg)*(b - avg) +
    (c - avg)*(c - avg) + 
    (d - avg)*(d - avg);

    double var = dsum / count;
    //double var = dsum / 4.0;

    System.out.println(var);
    }
}
