import java.util.ArrayList;
import java.util.List;

public class TemperatureStation implements WeatherStation {

    private double temperature;
    private List<Observer> observers = new ArrayList<>();

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public void registerObserver(Observer observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this.temperature);
        }
    }

}
