package src.converter;

public class ConversorModel {

    private Double celToFah;
    private Double ceToKel;
    private Double fahToKel;
    private Double fahToCel;
    private Double kelToCel;
    private Double kelToFah;

    public Double getCelToFah(){
        return celToFah;
    }

    public void setCelToFah(Double celToFah){
        this.celToFah = celToFah;
    }

    public Double getCeToKel(){
        return ceToKel;
    }

    public void setCeToKel(Double ceToKel){
        this.ceToKel = ceToKel;
    }

    public Double getFahToKel(){
        return fahToKel;
    }

    public void setFahToKel(Double fahToKel){
        this.fahToKel = fahToKel;
    }

    public Double getFahToCel(){
        return fahToCel;
    }

    public void setFahToCel(Double fahToCel){
        this.fahToCel = fahToCel;
    }

    public Double getKelToCel(){
        return kelToCel;
    }

    public void setKelToCel(Double kelToCel){
        this.kelToCel = kelToCel;
    }

    public Double getKelToFah(){
        return kelToFah;
    }

    public void setKelToFah(Double kelToFah){
        this.kelToFah = kelToFah;
    }

    public void celsius(Double valor) {
        Double fahrenheit = (valor * 9/5) + 32;
        Double kelvin = valor + 273.15;

        setCelToFah(fahrenheit);
        setCeToKel(kelvin);
    }

    public void fahrenheit(Double valor) {
        Double kelvin = (valor - 32) * 5/9 + 273.15;
        Double celsius = (valor - 32) * 5/9;

        setFahToKel(kelvin);
        setFahToCel(celsius);
    }

    public void kelvin(Double valor) {
        Double celsius = valor - 273.15;
        Double fahrenheit = (valor - 273.15) * 9/5 + 32;

        setKelToCel(celsius);
        setKelToFah(fahrenheit);
    }
}