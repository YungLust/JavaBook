class Factorial {
    long fact(int n){
        long res;
        if (n == 1) return 1;
        res = fact(n-1) * n;
        return res;
    }
}
class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();
        int n = 12;
        n = Math.abs(n);
        System.out.println("Factorial of " + n + " = " + f.fact(n));
    }
}