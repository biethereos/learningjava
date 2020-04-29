
public class BuildInFunction {
    public static void main(String[] args) {
        // Build-in function
        double result = Math.pow(2, 5);
        System.out.println(result);
        // User function
        int pow = 1;
        int y = 5;
        int x = 2;
        for (int i = 0; i < y; i++) {
            pow *= x; 
        }
        System.out.println(pow);
    }
}