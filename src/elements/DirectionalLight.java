package elements;

import primitives.Color;
import primitives.Point3D;
import primitives.Vector;

/**
 * DirectionalLight
 */
public class DirectionalLight extends Light implements LightSource {

    protected Vector _direction;

    //******************************CONSTRUCTORS********************************//

    /**
     * ctor
     * @param color Color
     * @param direction A vector that indicates the direction of light
     */
    public DirectionalLight(Color color, Vector direction){
        _color = new Color(color);
        _direction = new Vector(direction).NormalVector();
    }

    /**
     * copy ctor
     * @return
     */
    public DirectionalLight(DirectionalLight directionalLight){
        _color = new Color(directionalLight.getColor());
        _direction = new Vector(directionalLight.getDirection());
    }

    //******************************GETTERS********************************//


    public Vector getDirection() {
        return new Vector(_direction);
    }

    // ************************** Operations ***************************** //

    @Override
    public Color getIntensity() {
        return null;
    }

    /**
     * GetIntensity of Point
     *
     * @param point
     * @return
     */
    @Override
    public Color getIntensity(Point3D point) {
        return getColor();
    }

    /**
     * Vector between LightSource and Point
     *
     * @param point
     * @return
     */
    @Override
    public Vector getL(Point3D point) {
        return this.getD(point);
    }

    /**
     * Vector of strongest light from directionallight
     *
     * @param point
     * @return
     */
    @Override
    public Vector getD(Point3D point) {
        return new Vector(this._direction);
    }
}
