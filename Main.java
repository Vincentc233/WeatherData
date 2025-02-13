import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        double[] temps = {99.1, 142.0, 85.0, 85.1, 84.6, 94.3, 124.9, 98.0, 101.0, 102.5};
        ArrayList<Double> t = new ArrayList<Double>();
        for(double n : temps) t.add(n);
        WeatherData data1 = new WeatherData(t);
        data1.cleanData(85.0, 120.0);
        System.out.println(data1.returnArr());

        double[] temps2 = {100.5, 98.5, 102.0, 103.9, 87.5, 105.2, 90.3, 94.8, 109.1, 102.1, 107.4, 93.2};
        ArrayList<Double> t2 = new ArrayList<Double>();
        for(double n : temps2) t2.add(n);
        WeatherData data2 = new WeatherData(t2);
        System.out.println(data2.longestHeatWave(100.5));

        System.out.println(data2.longestHeatWave(95.2));
    }
}
