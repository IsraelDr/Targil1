package primitives;

/**
 * Class that contains two Coordinates and represents (x,y)
 */
public class Point2D{
    protected Coordinate _x;
    protected Coordinate _y;

    // ***************** Constructors ********************** //

    /**
     * ctor
     * @param x - coordinate x
     * @param y - coordinate y
     */
    public Point2D(double x, double y){
        this._x=new Coordinate(x);
        this._y=new Coordinate(y);
    }

    /**
     * Copy ctor
     * @param temp - object to copy
     */
    public Point2D(Point2D temp){
        this._x=new Coordinate(temp._x);
        this._y=new Coordinate(temp._y);
    }

    // ***************** Getters/Setters ********************** //

    public double get_x() {
        return _x.get_cord();
    }

    public double get_y() {
        return _y.get_cord();
    }
    // ***************** Administration  ******************** //

    @Override
    public boolean equals(Object obj) {
        if(this==obj)
            return true;
        if (!(obj instanceof Point2D)||obj==null)
            return false;
        return (this._x.equals(((Point2D)obj)._x)&&(this._y.equals(((Point2D)obj)._y)));
    }

    @Override
    public String toString() {
        return "("+this._x.toString()+","+this._y.toString()+")";
    }
    // ***************** Operations ******************** //

}
