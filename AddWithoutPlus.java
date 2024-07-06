//2235. Add Two Integers
public class AddWithoutPlus {
    public static void main(String[] args) {
        int a = 15;
        int b = 32;  
        int result = addWithoutPlus(a, b);
        System.out.println("Sum: " + result);
    }
    public static int addWithoutPlus(int a, int b) {
        while (b != 0) {
            int carry = a & b;
            a = a ^ b;
            // Carry is shifted by one so that adding it to a gives the required sum
            b = carry << 1;
        }
        return a;
    }
}
 
