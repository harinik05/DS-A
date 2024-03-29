package FibonnaciStyle;

public class fib_BF {
    public int fib(int n) {
        //1. base case
        if (n<=1){
            return n;
        }

        //2. fibonacci case
        int first = 0;
        int second = 1;
        int third = 0;
        for(int i = 2;i<=n;i++){
            third = first + second;
            first = second;
            second = third;
        }
        return third;
    }
}