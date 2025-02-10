import java.util.ArrayList;;
public class WeatherData
{
    /** Guaranteed not to be null and to contain only non-null entries */
    private ArrayList<Double> temperatures;

    public WeatherData(ArrayList<Double> temps){
        temperatures = temps;
    }

    public void cleanData(double lower, double upper)
    {
        for(int i =0; i< temperatures.size(); i++){
            if(temperatures.get(i) < lower) temperatures.remove(i);
            else if(temperatures.get(i) > upper) temperatures.remove(i);
        }
    }

    /**
     * Returns the length of the longest heat wave found in temperatures, as described in
     * part (b)
     * Precondition: There is at least one heat wave in temperatures based on threshold.
     */
    public int longestHeatWave(double threshold)
    {
        int maxHeatLength = 0;
        int heatLength = 0;

        for(int i = 0; i<temperatures.size(); i++){
            if(temperatures.get(i) > threshold) {
                heatLength++;
                System.out.println(heatLength);
            }
            else if(temperatures.get(i) <= threshold){
                if(heatLength > maxHeatLength) maxHeatLength = heatLength;
                heatLength = 0;
            }
        }
        return(maxHeatLength);
    }
     public ArrayList<Double> returnArr(){
        return(temperatures);
     }
    // There may be instance variables, constructors, and methods that are not shown.
}
