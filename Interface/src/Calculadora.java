
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculadora extends JFrame {

    final JTextField txtNumero1 = new JTextField(1000);
    final JTextField txtNumero2 = new JTextField(1000);
    final JTextField txtResultado = new JTextField(1000);

    final JLabel lblValor1 = new JLabel(" 1 - VALOR: ");
    final JLabel lblValor2 = new JLabel(" 2 - VALOR: ");
    final JLabel lblValor3 = new JLabel(" RESULTADO ");

    final JButton btnSomar = new JButton(" + ");
    final JButton btnSubtrair = new JButton(" - ");
    final JButton btnDividir = new JButton(" / ");
    final JButton btnMultiplicação = new JButton(" * ");

    public Calculadora() {

        final JTextField txtNumero1 = new JTextField(1000);
        final JTextField txtNumero2 = new JTextField(1000);
        final JTextField txtResultado = new JTextField(1000);

        final JLabel lblValor1 = new JLabel(" 1 - VALOR: ");
        final JLabel lblValor2 = new JLabel(" 2 - VALOR: ");
        final JLabel lblValor3 = new JLabel(" RESULTADO ");

        final JButton btnSomar = new JButton(" + ");
        final JButton btnSubtrair = new JButton(" - ");
        final JButton btnDividir = new JButton(" / ");
        final JButton btnMultiplicação = new JButton(" * ");

        setTitle("CALCULADORA NOOB");
        setSize(250, 300);
        setLocation(300, 500);

    }

    public void inicia() {
        getContentPane().setLayout(null);
        getContentPane().add(txtNumero1);
        getContentPane().add(txtNumero2);
        getContentPane().add(txtResultado);
        getContentPane().add(lblValor1);
        getContentPane().add(lblValor2);
        getContentPane().add(lblValor3);
        getContentPane().add(btnSomar);
        getContentPane().add(btnSubtrair);
        getContentPane().add(btnDividir);
        getContentPane().add(btnMultiplicação);

    }

    public static void main(String[] args) {
        Calculadora noob = new Calculadora();

    }
}
