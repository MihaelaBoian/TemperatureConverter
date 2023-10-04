public class Termo {
    public float toCelsius(){
        float Fahrenheit = 55.4f;
        return (5*(Fahrenheit-32))/9;
    }
    public float toFahrenheit(){
       float Celsius = 13f;
        return (Celsius*9)/5+32;
    }
}
