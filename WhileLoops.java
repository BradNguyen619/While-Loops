public class WhileLoops
{

    int a = 5;
    int b = 2;
    int c = 1;
    int d = -8;
    
    public void run() {
        int i = 0;
        int k = 20;
        while (i < 10) {
            System.out.println("i is " + i + " but is less than 10");
            i += 1;
        }
        while (k > 5) {
            System.out.println("k is " + k + " but is more than 5");
            k -= 1;
        }
        while (a < 10 && b <= 20) {
            System.out.println("a is " + a + " and b is " + b + " but a is less than 10 and b is less than 20");
            a += 1;
            b += 2;
        }
    }
    
    
    public static void main(String[] args)
    {        
        WhileLoops hw = new WhileLoops();
        hw.run();
    }
}


