package geometries;

import primitives.*;

import java.util.ArrayList;

/**
 * represents Tube with Ray and radius
 */
public class Tube extends RadialGeometry {
    protected Ray _ray;

    // ***************** Constructors ********************** //

    /**
     * ctor
     * @param ray
     * @param rad
     */
    public Tube(Ray ray,double rad){
        super(rad);
        this._ray=new Ray(ray);
    }

    /**
     * copy ctor
     * @param temp
     */
    public Tube(Tube temp){
        super(temp);
        this._ray=new Ray(temp.getRay());
    }
    // ***************** Getters/Setters ********************** //

    public Ray getRay() {
        return _ray;
    }
    // ***************** Administration  ******************** //
    @Override
    public String toString() {
        return this._ray.toString();
    }
    // ***************** Operations ******************** //

    /**
     * get normal to tube at point on geometrys
     * @param temp
     * @return
     */
    @Override
    public Vector getNormal(Point3D temp) {
        Point3D pointBase =this._ray.get_point();
        double c=pointBase.distance(temp);
        double a=Math.sqrt(Math.pow(c,2)-Math.pow(_radius,2));
        Vector ab=this._ray.get_vector().NormalVector().multipliedbyScalar(a);
        Vector ac=pointBase.vectorSubstract(temp);
        Vector fin =ac.add(ab);
        return fin;

    }

    @Override
    public ArrayList<Point3D> findIntersections(Ray ray) {
        return null;//
    }
}
