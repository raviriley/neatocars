//HIDE
package pkg;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

public abstract class Vehicle
{
    public abstract void translate(double x, double y);
	public abstract void draw();
	public abstract void fill();
	public abstract double getX();
}
