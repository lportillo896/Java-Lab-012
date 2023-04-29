public class Simulation {
    public static void main (String[] args) {
        SolarSystem a = new SolarSystem();
        Sun sun = new Sun("Sun", 432690.0, 1.989, 5722.0);
        Planet earth = new Planet("Earth", 3958.8, 5.972, 92.96, 25.0, 25.0);

        a.addSun(sun);
        a.addPlanet(earth);

        for(int i = 1; i < 5; i++){
            a.movePlanets();
            a.showSun();
            a.showPlanets();
        }
    }
}
