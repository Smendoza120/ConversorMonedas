package conversorMonedas;

import javax.swing.JOptionPane;

public class ConvertirMonedas {

  public void ConvertirPesosADolares(double valor) {
    double monedaDolar = valor / 4515.32;
    monedaDolar = (double) Math.round(monedaDolar * 100d) / 100;

    JOptionPane.showMessageDialog(null, "Tienes $ " + monedaDolar + " Dolares");
  }

  public void ConvertirPesosAEuros(double valor) {
    double monedaEuro = valor / 4923.82;
    monedaEuro = (double) Math.round(monedaEuro * 100d) / 100;
    JOptionPane.showMessageDialog(null, "Tienes $ " + monedaEuro + " Euros");
  }

  public void ConvertirPesosALibras(double valor) {
    double monedaLibra = valor / 5604.94;
    monedaLibra = (double) Math.round(monedaLibra * 100d) / 100;
    JOptionPane.showMessageDialog(null, "Tienes $ " + monedaLibra + " Libras Esterlinas");
  }

  public void ConvertirPesosAYen(double valor) {
    double monedaYen = valor / 33.78;
    monedaYen = (double) Math.round(monedaYen * 100d) / 100;
    JOptionPane.showMessageDialog(null, "Tienes $ " + monedaYen + " Yuanes");
  }

  public void ConvertirPesosAWon(double valor) {
    double monedaWon = valor / 3.41;
    monedaWon = (double) Math.round(monedaWon * 100d) / 100;
    JOptionPane.showMessageDialog(null, "Tienes $ " + monedaWon + " Wons");
  }
}
