public class TemperatureDisplay implements Observer {
    private double temperature;

    @Override
    public void update(double temperature) {
        this.setTemperature(temperature);
    }
    
    public double getTemperature() {
        return temperature;
    }

    private void setTemperature(double temperature) {
        this.temperature = temperature;

    }
}
