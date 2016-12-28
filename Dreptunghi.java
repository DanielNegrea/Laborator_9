
public class Dreptunghi
{
    private int x;
    private int y;
    private int a;  //  latimea
    private int b;  //  inaltimea

    public Dreptunghi()
    {
        x = y = a = b = 10;
    }

    public Dreptunghi(int x, int y, int a, int b)
    {
        this.x = x; this.y = y; this.a = a; this.b = b;
    }

    public void translatez(int dx, int dy)
    {
        x = x + dx; y = y + dy;
    }

    public int perimetru()
    {
        int perim;
        perim = 2 * a + 2 * b;
        return perim;
    }

    public long arie()
    {
        long sup;
        sup = a * b;
        return sup;
    }

    public void mod_x(int dx)
    {
        x = dx;
    }

    public void mod_y(int dy)
    {
        y = dy;
    }

    public int da_x()
    {
        return x;
    }

    public int da_y()
    {
        return y;
    }
}
