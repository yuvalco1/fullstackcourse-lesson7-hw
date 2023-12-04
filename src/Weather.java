public class Weather {

    // Temperature in degrees Celsius
    public double temperature;

    public double humidity;

    public boolean isCloud;

    public double chanceOfRain;

    public Weather(double temperature, double humidity, boolean isCloud, double chanceOfRain) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.isCloud = isCloud;
        this.chanceOfRain = chanceOfRain;
    }

    //create toString method
    public String toString(){
        return "The temperature is " + this.temperature + " degrees, the humidity is " + this.humidity + " and the chance of rain is " + this.chanceOfRain + "%";
    }

    public void setChanceOfRain(double chanceOfRain) {
        //validate that chanceOfRain is between 0 and 100
        if (chanceOfRain >= 0 && chanceOfRain <= 100) {
            this.chanceOfRain = chanceOfRain;
        } else {
            System.out.println("Chance of rain must be between 0 and 100");
        }
    }

    // printTempFahrenheit method
    public void printTempFahrenheit() {
        System.out.println("The temperature is " + (this.temperature * 9 / 5 + 32) + " degrees Fahrenheit");
    }


}
