

public class Point3d 
{
    /** Координаты x, y и z соответственно */
    private double xCoord;
    private double yCoord;
    private double zCoord;

    /** Конструктор по умолчанию */
    public Point3d()
    {
        this(0, 0, 0);
    }    
    /** Конструктор с тремя точками */
    public Point3d(double x, double y, double z)
    {
        xCoord = x;
        yCoord = y;
        zCoord = z;
    }

    /** getter-ы и setter-ы для трёх координат */
    public void setX(double newCoord)
    {
        xCoord = newCoord;
    }
    public void setY(double newCoord)
    {
        yCoord = newCoord;
    }
    public void setZ(double newCoord)
    {
        zCoord = newCoord;
    }

    public double getX() { return xCoord; }
    public double getY() { return yCoord; }
    public double getZ() { return zCoord; }
}
