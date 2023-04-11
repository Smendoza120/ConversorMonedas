package conversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedasAPesos {

  public void ConvertirDolaresAPesos(double valor){
    double monedaDolar = valor * 4515.32;
    monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;
    JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Pesos Colombianos");
  }

  public void ConvertirEurosAPesos(double valor){
    double monedaEuro = valor * 4921.84;
    monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
    JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Pesos Colombianos");
  }

  public void ConvertirLibrasAPesos(double valor) {
    double monedaLibra = valor * 5602.47;
    monedaLibra = (double) Math.round(monedaLibra * 100d) / 100;
    JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibra + " Pesos Colombianos");
  }

  public void ConvertirYenAPesos (double valor) {
    double monedaYen = valor * 33.73;
    monedaYen = (double) Math.round(monedaYen * 100d) / 100;
    JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Pesos Colombianos");
  }

  public void ConvertirWonAPesos (double valor){
    double monedaWom = valor * 3.41;
    monedaWom = (double) Math.round(monedaWom * 100d) / 100;
    JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWom + " Pesos Colombianos");
  }
}
