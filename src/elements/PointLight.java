package elements;

import primitives.Color;
import primitives.Point3D;
import primitives.Vector;

/**
 * Class of PointLight
 */
public class PointLight extends Light implements LightSource {
    protected Point3D _position;
    protected double _Kc,_Kl,_Kq;
    //******************************CONSTRUCTORS********************************//
    /**
     * Ctor
     * @param color The color of the PointLight
     * @param position Location of the PointLight
     * @param Kc Kc
     * @param Kl Kl
     * @param Kq Kq
     */
    public PointLight(Color color, Point3D position,double Kc,double Kl,double Kq){
        _color = new Color(color);
        _position = new Point3D(position);
        _Kc = Kc;
        _Kl = Kl;
        _Kq = Kq;
    }

    /**
     * copy ctor
     * @param pointLight Point Light
     */
    public PointLight(PointLight pointLight){
        _color = new Color(pointLight.getColor());
        _position = new Point3D(pointLight.getPosition());
        _Kc = pointLight.getKc();
        _Kl = pointLight.getKl();
        _Kq = pointLight.getKq();
    }
    //******************************GETTERS********************************//
    public Point3D getPosition() {
        return _position;
    }

    public double getKc() {
        return _Kc;
    }

    public double getKl() {
        return _Kl;
    }

    public double getKq() {
        return _Kq;
    }
    //******************************OPERATIONS********************************//
    /**
     *  Intensity
     * @return
     */
    @Override
    public Color getIntensity() {
        return null;
    }

    /**
     * GetIntensity of Point
     *
     * @param point Point
     * @return Returns Intensity of Point
     */
    @Override
    public Color getIntensity(Point3D point) {
        double distance = _position.distance(point);
        double denominator = _Kc + distance * _Kl + _Kq * Math.pow(distance, 2);

        Color result = new Color(super._color);
        result.scale(1 / denominator);
        return result;
    }

    /**
     * Vector between LightSource and Point
     *
     * @param point The spotlight location
     * @return Normal vector between the spotlight and  point
     */
    @Override
    public Vector getL(Point3D point) {
        return (point.vectorSubstract(_position)).NormalVector();
    }

    /**
     * Vector of strongest light from spotlight
     *
     * @param point Point
     * @return Returns always null
     */
    @Override
    public Vector getD(Point3D point) {
        return this.getL(point);
    }
}
