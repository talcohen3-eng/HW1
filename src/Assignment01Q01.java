public class Assignment01Q01 {
    public static void main(String[] args) {
        for (String word : args) {
            int ascii_value = (int) word.charAt(0);
            if (ascii_value%5 == 0) {
                System.out.println(word.charAt(0));
            }
        } 
    }
}
