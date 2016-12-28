
public class Laborator_9
{
    // instance variables - replace the example below with your own
    private Dreptunghi dr;
    private Cerc cr;

    /**
     * Constructor for objects of class Laborator_9
     */
    public Laborator_9()
    {
        // initialise instance variables
        dr = new Dreptunghi (30, 25, 10, 7);
        cr = new Cerc (65, 30, 20);
        System.out.println("Aria dreptunghiului: " + dr.arie() + ", aria cercului: " + cr.arie());
    }
public static void main(String args[])
{
    Laborator_9 l = new Laborator_9();
}
}
