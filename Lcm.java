import java.util.Scanner;

class Lcm {
    // Gcd of u and v using recursive method
    static int GCD(int u, int v)
    {
        if (u == 0)
            return v;
        return GCD(v % u, u);
    }
 
    // LCM of two numbers
    static int LCM(int u, int v)
    {
        return (u / GCD(u, v)) * v;
    }
 
    // The Driver method
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 2 numbers");
        int u = sc.nextInt();int v = sc.nextInt();
        System.out.println("LCM of " + u + " and " + v
                           + " is " + LCM(u, v));


                           sc.close();
    }
}