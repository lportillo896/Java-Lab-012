import java.util.ArrayList;
import java.util.List;
public class SolarSystem {
    private List<Planet> planets;
    private Sun sol;
    public SolarSystem() {
        planets = new ArrayList<>();
    }
    public void addPlanet(Planet e) {
        planets.add(e);
    }
    public void addSun(Sun s) {
        this.sol = s;
    }
    public void showPlanets() {
        for(Planet e: planets){
            System.out.println(e.toString());
        }
    }
    public void showSun() {
        System.out.println(sol.toString());
    }
    public void movePlanets() {
        double G = 0.1;
        double dt = 0.001;

        for (Planet e: this.planets) {
            e.moveTo(e.getXPos() + dt * e.getXVel(),
                    e.getYPos() + dt * e.getYVel());

            double rx = this.sol.getXPos() - e.getXPos();
            double ry = this.sol.getYPos() - e.getYPos();
            double r = Math.sqrt(Math.pow(rx, 2) + Math.pow(ry, 2));

            double accX = G * this.sol.getMass() * rx / Math.pow(r, 3);
            double accY = G * this.sol.getMass() * ry / Math.pow(r, 3);

            e.setXVel(e.getXVel() + dt * accX);
            e.setYVel(e.getYVel() + dt * accY);
        }
    }
}
