package conversorMonedas;

import javax.swing.JOptionPane;

public class Function {

  ConvertirMonedas monedas = new ConvertirMonedas();
  ConvertirMonedasAPesos pesos = new ConvertirMonedasAPesos();

  public void ConvertirMonedas(double dato){

    String opcion = (JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero", "Monedas", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"De Pesos a Dólar", "De Pesos a Euro", "De Pesos a Libras", "De Pesos a Yen", "De Pesos a Wom Coreano", "De Dólar a Pesos", "De Euro a Pesos", "De Libras a Pesos", "De Yen a Pesos", "De Wom Coreano a Pesos"}, "Seleccion")).toString();

    switch (opcion) {
      case "De Pesos a Dólar":
        monedas.ConvertirPesosADolares(dato);
        break;
      case "De Pesos a Euro":
        monedas.ConvertirPesosAEuros(dato);
        break;
      case "De Pesos a Libras":
        monedas.ConvertirPesosALibras(dato);
        break;
      case "De Pesos a Yen": 
        monedas.ConvertirPesosAYen(dato);
        break;
      case "De Pesos a Wom Coreano":
        monedas.ConvertirPesosAWon(dato);
        break;
      case "De Dólar a Pesos":
        pesos.ConvertirDolaresAPesos(dato);
        break;
      case "De Euro a Pesos":
        pesos.ConvertirEurosAPesos(dato);
        break;
      case "De Libras a Pesos":
        pesos.ConvertirLibrasAPesos(dato);
        break;
      case "De Yen a Pesos":
        pesos.ConvertirYenAPesos(dato);
        break;
      case "De Wom Coreano a Pesos":
        pesos.ConvertirWonAPesos(dato);
        break;

      default:
        break;
    }
  }
}
