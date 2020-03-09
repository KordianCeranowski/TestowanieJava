import java.util.Arrays;
import java.util.List;

class Planets {
    double CalculateAge(double timeInSeconds, String planetName){

        List<String> planets = Arrays.asList("Merkury", "Wenus", "Ziemia", "Mars", "Jowisz", "Saturn", "Uran", "Neptun");
        List<Double> times = Arrays.asList(0.2408467, 0.61519726, 1.0, 1.8808158, 11.862615, 29.447498, 84.016846, 164.79132);
        int secondsInYear = 31557600;

        if(!planets.contains(planetName) || timeInSeconds < 0)
            throw new IllegalArgumentException();

        int indexOfPlanet = planets.indexOf(planetName);
        Double timeFactor = times.get(indexOfPlanet);

        return timeInSeconds / secondsInYear / timeFactor;
    }
}
