import javax.swing.JOptionPane;

public class Conversor {
  public static void main(String[] args) {

    String[] primerValor = { "Dolar", "Euro", "Libras Esterlinas", "Yen Japonés", "Won soul-coreano",
        "Peso Colombiano" };
    String[] segundoValor = { "Dolar", "Euro", "Libras Esterlinas", "Yen Japonés", "Won soul-coreano",
        "Peso Colombiano" };

    String saldo = JOptionPane.showInputDialog(null, "Ingresa el valor a convertir");
    String moneda = (String) JOptionPane.showInputDialog(null, "Selecciona la moneda", "moneda",
        JOptionPane.DEFAULT_OPTION, null, primerValor, primerValor[0]);

    switch (moneda) {
      case "Dolar":
        JOptionPane.showMessageDialog(null,
            "Peso Colombiano: " + saldo + " Dolar: " + (Double.parseDouble(saldo) * 0.00021));
        break;
      case "Euro":
        JOptionPane.showMessageDialog(null,
            "Peso Colombiano: " + saldo + " Euro: " + (Double.parseDouble(saldo) * 0.00020));
        break;
      case "Libras Esterlinas":
        JOptionPane.showMessageDialog(null,
            "Peso Colombiano: " + saldo + " Libras Esterlinas: " + (Double.parseDouble(saldo) * 0.00018));
        break;
      case "Yen Japonés":
        JOptionPane.showMessageDialog(null,
            "Peso Colombiano: " + saldo + " Yen Japonés: " + (Double.parseDouble(saldo) * 0.029));
        break;
      case "Won soul-coreano":
        JOptionPane.showMessageDialog(null,
            "Peso Colombiano: " + saldo + " Won soul-coreano: " + (Double.parseDouble(saldo) * 0.28));
        break;
      default:
        break;
    }
  }
}
