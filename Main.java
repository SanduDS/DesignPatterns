public class Main {
    public static void main(String[] args) {
        TemperatureAlertSystem temperatureAlertSystem = new TemperatureAlertSystem();
        TemperatureDisplay temperatureDisplay = new TemperatureDisplay();
        TemperatureStation weatherStation = new TemperatureStation();
        weatherStation.registerObserver(temperatureAlertSystem);
        weatherStation.registerObserver(temperatureDisplay);
        weatherStation.setTemperature(60);
        weatherStation.notifyObservers();
        temperatureAlertSystem.alert();
        weatherStation.setTemperature(40);
        weatherStation.notifyObservers();
        temperatureAlertSystem.alert();
    }
}
