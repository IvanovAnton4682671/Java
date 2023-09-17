import java.util.*;

public class Polynomial
{
    int n;
    int [] p;

    Polynomial(int n)
    {
        this.n = n;
        p = new int[n];
    }

    void init()
    {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n; i++)
            p[i] = sc.nextInt();
    }

    void print()
    {
        for (int i = 0; i < n; i++)
        {
            if (i == (n-1))
            {
                System.out.print("(" + p[i] + "*x^" + (n - i - 1) + ")");
                break;
            }
            System.out.print("(" + p[i] + "*x^" + (n - i - 1) + ")+");
        }
    }

    void calculate(int x)
    {
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += p[i] * (Math.pow(x, (n - i - 1)));
        System.out.println(sum);
    }

    void sum(int [] p2)
    {
        for (int i = 0; i < n; i++)
            p[i] += p2[i];
    }

    void dif(int [] p2)
    {
        for (int i = 0; i < n; i++)
            p[i] -= p2[i];
    }
}