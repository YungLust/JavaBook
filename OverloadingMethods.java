class Stdio{
    static void print(int var){
        System.out.printf("Printing integer: %d\n",var);
    }
    static void print(String var){
        System.out.printf("Printing string: %s\n",var);
    }
    static void print(char var){
        System.out.printf("Printing character: %c\n",var);
    }
    static void print(float var){
        System.out.printf("Printing floating point number: %f\n",var);
    }
}
public class OverloadingMethods {
    public static void main(String[] args) {
        int myint = 125;
        String str = "Test alabay";
        Stdio.print(myint);
        Stdio.print(str);
    }
}
