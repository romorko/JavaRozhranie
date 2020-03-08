package map.bod;

public interface Bod
{
    float getX();
    float getY();
    float [] getXY();
    void setX(float _x);
    void setY(float _y);
    void setXY(float ...suradnice);
    double getDistance(Bod other);
    Bod Plus(Bod other);
    Bod Minus(Bod other);
    boolean equals(Object other);
    String toString();
}
