package geometries;

public abstract class RadialGeometry extends Geometry {
    protected double _radius;

    // ***************** Constructors ********************** //
    public RadialGeometry(double rad){
        super();
        this._radius=rad;
    }
    /**
     * Copy ctor
     * @param temp
     */
    public RadialGeometry(RadialGeometry temp){
        super(temp);
        this._radius=temp.get_radius();
    }

    // ***************** Getters/Setters ********************** //

    public double get_radius() {
        return _radius;
    }
}