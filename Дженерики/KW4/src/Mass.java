class Mass<T>
{
    T[]a;

    Mass(T[]a)
    {
        this.a = a.clone();
    }

    void print()
    {
        System.out.println("Ваш массив:");
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i]+" ");
    }

    T elemByInd(int i) throws ArrayIndexOutOfBoundsException
    {
        if (i < 0 || i > a.length)
            throw new ArrayIndexOutOfBoundsException("Выход за границы массива.");
        return a[i];
    }

    void chast(int p) throws ArrayIndexOutOfBoundsException
    {
        if (p < 0 || p > a.length)
            throw new ArrayIndexOutOfBoundsException("Выход за границы индекса.");
        for (int i = 0; i < p; i++)
            System.out.print(a[i]+" ");
    }
}