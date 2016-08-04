public class Tribonacci {
    
    private static int index = 0;
    private static int endpoint = 40;
    
    public static void tribonacci(int a, int b, int c) {
        
        System.out.println("index: " + index + " " + c);
        
        if (index == endpoint) {
            return;
        }
        
        index++;
        
        
        tribonacci(b, c, a+b+c);
    }
    
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 1;
        //System.out.println("index: " + index + " " + b);
        
        tribonacci(a, b, c);
    }
}
