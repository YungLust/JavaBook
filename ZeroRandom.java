import java.util.Random;
public class ZeroRandom {
    private Random r = new Random();
    private int a,b,c = 0;
    private float res;
    public void division(){
        try{
            a = r.nextInt(9000);
            b = r.nextInt(100);
            c = r.nextInt(100);
            System.out.printf(" a: %d\t b: %d\t c: %d\t",a,b,c);
            res =  a/b/c;
            System.out.println("RES: " + res);
        }
        catch(ArithmeticException e){
            System.out.println("\n\n\nZero division!\n\n");
        }
    }

    public static void main(String[] args){
        ZeroRandom zr = new ZeroRandom();
        for(int i = 0; i<3200; i++){
            zr.division();;
        }
    }
}