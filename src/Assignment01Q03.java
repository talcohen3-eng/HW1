public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");

        ////////////////////////////////////////////////////////////////
        // TODO: Replace this code with the correct Fibonacci sequence
        ////////////////////////////////////////////////////////////////
        /// ...
        int[] fib_array = new int[x];
        fib_array[0] = 1;
        fib_array[1] = 1;
        int numOdd = 2;
        for (int i=2; i<x; i++){
            fib_array[i] = fib_array[i-2] + fib_array[i-1];
            if (fib_array[i]%2 != 0){
                numOdd ++;
            }
        }
        for (int i = 0; i < x; i++) {
            System.out.print(fib_array[i]);
            if (i < x - 1) 
                System.out.print(" "); // Make sure we don't print a trailing space
        }
        System.out.println();
        
        ////////////////////////////////////////////////////////////////
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
