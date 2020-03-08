package map.bod;

public class Main {

    public static void main(String[] args)
    {
        Bod2D Prvy= new Bod2D(1,2);
        Bod2D Druhy = new Bod2D(2,3);
        System.out.println(Prvy==Druhy);
        Bod2D Treti = (Bod2D) Prvy.Plus(Druhy);
        System.out.print(Treti.getX()+" "+Treti.getY());
    }
}
