public class TemperatureAlertSystem implements Observer {

    private double temperature;

    public double getTemperature() {
        return temperature;
    }

    private void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public void update(double temperature) {
        this.setTemperature(temperature);
    }

    public void alert() {
        if (temperature > 50) {
            System.out.println("Temperature is above 50 degrees");
        } else {
            System.out.println("Temperature is below 50 degrees");
        }
    }
    
}
