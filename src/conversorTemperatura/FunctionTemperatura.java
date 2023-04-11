package conversorTemperatura;

import javax.swing.JOptionPane;

public class FunctionTemperatura {

  ConvertirTemperatura temperatura = new ConvertirTemperatura();

  public void ConvertirTemperatura(double dato) {
    String opcion = (JOptionPane.showInputDialog(null, "Elije una opción para convertir", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Grados Celcius a Grados Farenheit", "Grados Celcius a Kelvin", "Grados Farenheit a Grados Celcius","Kelvin a Grados Celcius","Kelvin a Grados Farenheit"}, "Selección")).toString();
    
    switch (opcion) {
      case "Grados Celcius a Grados Farenheit":
        temperatura.ConvertirCelciusAFarenheit(dato);
        break;
      case "Grados Celcius a Kelvin":
        temperatura.ConvertirCelciusAKelvin(dato);
        break;
      case "Grados Farenheit a Grados Celcius":
        temperatura.ConvertirFarenheitACelcius(dato);
        break;
      case "Kelvin a Grados Celcius":
        temperatura.ConvertirKelvinACelcius(dato);
        break;
      case "Kelvin a Grados Farenheit":
        temperatura.ConvertirKelvinAFarenheit(dato);
        break;
      default:
        break;
    }
  }

}
