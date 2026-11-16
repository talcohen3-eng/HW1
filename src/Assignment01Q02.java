public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        int n = Integer.parseInt(args[0]);
        for (int i=1; i<=n*2-1; i+=2){
            if ((i+1)/2 % 2 == 0){
                approxPi -= 4.0/i;
            }
            else {
                approxPi += 4.0/i;
            }

        }
        
        System.out.println(approxPi + " " + actualPi);
    }
}
