import java.util.Arrays;

public class Fibonacci {
    public static void main(String[] args) {
        int n = 9;
        System.out.println("Fibonacci Series using Dynamic Programming: " + Arrays.toString(getFibNumbers(n)));

    }

    private static int[] getFibNumbers(int n){
        int f[] = new int[n+1];

        f[0] = 0;
        f[1] = 1;

        for(int i=2;i <= n;i++){
            f[i] = f[i-1]+f[i-2];
        }

        return f;
    }
}
