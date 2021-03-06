package scene;

/**
 * defines a key (or some keys) for each geometry in the scene
 */
public class Key {
    protected int _x;
    protected int _y;
    protected int _z;

    //****************Constructor****************//
    public Key(int x, int y, int z) {
        this._x = x;
        this._y = y;
        this._z = z;
    }

    //*************************Setter/Getter**********//
    public int getX() {
        return _x;
    }

    public void setX(int _x) {
        this._x = _x;
    }

    public void setY(int _y) {
        this._y = _y;
    }

    public void setZ(int _z) {
        this._z = _z;
    }

    public int getY() {
        return _y;
    }

    public int getZ() {
        return _z;
    }

    //********************Operations*************************//

    /**
     * Checks if the given key is greater than max key
     *
     * @param max The max key
     * @return Returns true when the given key is greater than the max key
     */
    public Boolean isgreater(Key max) {
        return this.getX() > max.getX() || this.getY() > max.getY() || this.getZ() > max.getZ();
    }

    @Override
    public boolean equals(Object obj) {
        return this._x == ((Key) obj)._x && this._y == ((Key) obj)._y && this._z == ((Key) obj)._z;
    }

    @Override
    public int hashCode() {
        int res = (int) (_x ^ (_x >>> 32));
        res = 31 * res + (int) (_y ^ (_y >>> 32));
        res = 31 * res + (int) (_z ^ (_z >>> 32));
        return res;
    }
}
