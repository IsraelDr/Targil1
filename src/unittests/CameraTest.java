package unittests;

import elements.Camera;
import org.junit.Test;
import primitives.*;

import static org.junit.Assert.*;

public class CameraTest {

    @Test
    public void constructRayThroughPixel() {
        int pixelX = 1080;
        int pixelY = 1920;
        double screenDistance = 1.5;
        double screenWidth = 2.5;
        double screenHeight = 3.5;
        int i = 5000;
        int j = 6000;
        Point3D center = new Point3D(5,5,5);
        Vector unit1 = new Vector(1,0,0);
        Vector unit2 = new Vector(0,1,0);
        Camera camera = new Camera(center,unit1, unit2);
        Ray rayTest = camera.constructRayThroughPixel(pixelX,pixelY,i,j,screenDistance,screenWidth,screenHeight);
        assertTrue(rayTest.get_point().equals(center));
    }
}