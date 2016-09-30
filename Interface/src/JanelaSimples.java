
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JanelaSimples {

    public JanelaSimples() {
        final JButton btnLimpar = new JButton("LIMPAR");
        final JTextField txtNome = new JTextField(10);
        final JFrame janela = new JFrame("Tela");
        final JButton btnSair = new JButton("SAIR");
        janela.setSize(760, 530);

        final JPanel painel = new JPanel();
        painel.add(btnLimpar);
        painel.add(txtNome);
        painel.add(btnSair);

        janela.getContentPane().add(painel);
        janela.setVisible(true);
        btnLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                txtNome.setText(" ");
            }
        });

        btnSair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }

        });

    }

    public static void main(String[] args) {
        JanelaSimples j = new JanelaSimples();

    }
}
