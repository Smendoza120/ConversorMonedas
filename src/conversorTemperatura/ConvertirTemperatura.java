package conversorTemperatura;

import javax.swing.JOptionPane;

public class ConvertirTemperatura {

  public double ConvertirCelciusAFarenheit(double valor) {
    double farenheit = valor * 1.8 + 32;
    farenheit = (double) Math.round(farenheit * 100d) / 100;
    JOptionPane.showMessageDialog(null, +valor + " Grados Celcius son " + farenheit + " Grados Farenheit");
    return farenheit;
  }

  public double ConvertirCelciusAKelvin(double valor) {
    double kelvin = valor + 273.15;
    kelvin = (double) Math.round(kelvin * 100d) / 100;
    JOptionPane.showMessageDialog(null, valor + " Grados Celcius son " + kelvin + " Kelvin");
    return kelvin;
  }

  public void ConvertirFarenheitACelcius(double valor){
    double farenheitCelcius = (valor - 32) / 1.8;
    farenheitCelcius = (double) Math.round(farenheitCelcius * 100d) / 100;
    JOptionPane.showMessageDialog(null, valor + " Grados Farenheit son " + farenheitCelcius + " Celcius");
  }

  public double ConvertirKelvinACelcius(double valor){
    double kelvinCelcius = valor -273.15;
    kelvinCelcius = (double) Math.round(kelvinCelcius * 100d) / 100;
    JOptionPane.showMessageDialog(null, valor + " Kelvin son " + kelvinCelcius + " Celcius");
    return kelvinCelcius;
  }

  public void ConvertirKelvinAFarenheit(double valor) {
    double kelvinFarenheit = ConvertirKelvinACelcius(valor);
    kelvinFarenheit = ConvertirCelciusAFarenheit(valor);
    kelvinFarenheit = (double) Math.round(kelvinFarenheit *100d) / 100;
    JOptionPane.showMessageDialog(null, valor + " Kelvin son " + kelvinFarenheit + " Grados Farenheit");
  }

}
