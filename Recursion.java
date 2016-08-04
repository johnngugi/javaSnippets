package recursion;

public class Recursion {

    private static int index = 0;
    private static int stoppingpoint = 40;
    
    public static void fibonacci(int n1, int n2) {
        
        System.out.println("index: " + index + " -> " + n2);
        
        if (index == stoppingpoint) {
            return;
        }
        
        index++;
        
        fibonacci(n2, n1+n2);
    }
    public static void main(String[] args) {
        
        int n1 = 0;
        int n2 = 1;  
        System.out.println("index: " + index + " -> " +n1);
        
        fibonacci(n1, n2);
        
    }
    
}
