
public class Cerc
{
    private int x;
    private int y;
    private int raza;  
 
    public Cerc()
    {
        x = y = raza = 10;
    }

    public Cerc(int x, int y, int raza)
    {
        this.x = x; this.y = y; this.raza = raza;
    }

    public void translatez(int dx, int dy)
    {
        x = x + dx; y = y + dy;
    }

    public int perimetru()
    {
        int perim;
        perim = (int)(2 * Math.PI * raza);
        return perim;
    }

    public long arie()
    {
        long sup;
        sup = (int)(Math.PI * raza * raza);
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
