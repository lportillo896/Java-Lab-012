/**
 *
 * @author Trevor Hartman
 * @author Logan Portillo
 *
 * @since Version 1.0
 */

public class Sun {
    private final String name;
    private final double radius;
    private final double mass;
    private final double temp;
    private double x;
    private double y;
    public Sun(String name, double radius, double mass, double temp) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.temp = temp;
    }
    public double getXPos(){
        return x;
    }
    public double getYPos() {
        return y;
    }
    public double getMass() {
        return mass;
    }
    public String toString() {
        return String.format("Name: "+name+" Coordinates: ("+x+","+y+") Mass: "+mass+" Temperature: "+temp);
    }
}
