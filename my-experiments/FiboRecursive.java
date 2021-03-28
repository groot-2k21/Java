import java.util.Scanner;

public class FiboRecursive {
    /**
    recursive calculation of the sum of a sequence of fibonacci numbers 
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the last number in the sequence:");
        int last = scanner.nextInt();
        int result = get_fibo(last);
        
        System.out.println(result);
        scanner.close();
    }

    private static int get_fibo(int n){
        if (n == 0 || n == 1)
            return n;

        return get_fibo(n-1) + get_fibo(n-2);
    }
}
