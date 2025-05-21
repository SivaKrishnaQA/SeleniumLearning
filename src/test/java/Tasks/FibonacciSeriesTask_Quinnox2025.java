package Tasks;

public class FibonacciSeriesTask_Quinnox2025 {

    public static void main(String[] args) {
        int a =0;
        int b=1;
        int n =10;


        for (int i=0;i<n;i++)
        {
            int series =a+b;
            System.out.print(a + "," );
            a=b;
            b=series;
        }
    }
}
