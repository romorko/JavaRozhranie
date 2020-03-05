package map.bod;

public class Bod2D implements Bod
{
    private float x;
    private float y;
    public Bod2D(float _x,float _y)
    {
        x=_x;
        y=_y;
    }

    @Override
    public float getX()
    {
        return x;
    }

    @Override
    public float getY()
    {
        return y;
    }

    @Override
    public float[] getXY()
    {
        return new float[]{x,y};
    }

    @Override
    public void setX(float _x)
    {
        x=_x;
    }

    @Override
    public void setY(float _y)
    {
        y=_y;
    }

    @Override
    public void setXY(float... suradnice)
    {
        x=suradnice[0];
        y=suradnice[1];
    }

    @Override
    public double getDistance(Bod other)
    {
        return Math.sqrt(Math.pow(x-other.getX(),2)+Math.pow(y-other.getY(),2));
    }

    @Override
    public Bod Plus(Bod other)
    {
        return new Bod2D(x+other.getX(),y+other.getY());
    }

    @Override
    public Bod Minus(Bod other)
    {
        return new Bod2D(x-other.getX(),y-other.getY());
    }

    @Override
    public boolean equals(Bod other)
    {
        return (x==other.getX() && y==other.getY())?true:false;
    }
}
