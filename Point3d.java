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

    /** Метод для сравнения */
    public boolean equals(Point3d other)
    {
        return (this.xCoord == other.xCoord) && (this.yCoord == other.yCoord) && (this.zCoord == other.zCoord);
    }

    /** Метод для вычисления расстояния между двумя точками */
    public double distanceTo(Point3d other)
    {
        if(this.equals(other))
            return 0;
        return Math.sqrt(Math.pow(this.xCoord - other.xCoord, 2) + Math.pow(this.yCoord - other.yCoord, 2) + Math.pow(this.zCoord - other.zCoord, 2));
    }
}
