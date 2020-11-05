import javax.swing.*;
import java.awt.*;

public class Cadastro extends JFrame{
    
    private JTextField nomeInput;

    private JTextField sobrenomeInput;

    private JTextField emailInput;

    public Cadastro() {
        setTitle("Cadastro de usuário");
        setSize(500,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        configurarTela();
        setVisible(true);

    }

    private void configurarTela() {
        JPanel root = new JPanel();
        ImageIcon icon = new ImageIcon();

        icon = new ImageIcon("assets/images/icon.jpg");
        JLabel imagem = new JLabel(icon);
        imagem.setBounds(0, 0, 250, 500);

        icon = new ImageIcon("assets/images/back.jpg");
        JLabel back = new JLabel(icon);
        back.setBounds(250, 0, 200, 100);


        root.setLayout(new BorderLayout());

        JPanel esquerda = new JPanel();
        esquerda.setPreferredSize(new Dimension(250,200));

        JPanel direita = new JPanel();
        direita.setPreferredSize(new Dimension(250,200));
        direita.setBackground(Color.WHITE);

        JLabel titulo = new JLabel("<html>Hella narwhal Cosby sweater<br>McSewwney's, salvia kitsch before they<br> sold out High life.</html>");
        titulo.setBounds(40, 10, 200, 100);

        JLabel subtitulo = new JLabel("<html>Takamaru Ayako<br/>Manager an inVision</html>");
        subtitulo.setBounds(50, 70, 200, 100);

        JLabel criarConta = new JLabel("<html><h2>Create an Accont</h2><p>Use your work email to create new accont, it's free.</p>");
        criarConta.setBounds(270, 90, 200, 100);

        JLabel sign = new JLabel("<html>Have an account? <a href='#'> Sign in</a></html>");
        sign.setBounds(290, 400, 200, 100);

        JLabel nomeLabel = new JLabel("First Name");
        nomeLabel.setBounds(290,210,200,10);
        nomeLabel.setFont (nomeLabel.getFont ().deriveFont (10.0f));
        nomeLabel.setForeground(Color.BLACK);

        nomeInput = new JTextField(30);
        nomeInput.setBounds(290,220,150,20);
        nomeInput.setFont (nomeInput.getFont ().deriveFont (10.0f));
        nomeInput.setForeground(Color.BLACK);

        JLabel sobrenomeLabel = new JLabel("Last Name");
        sobrenomeLabel.setBounds(290,250,200,10);
        sobrenomeLabel.setFont (sobrenomeLabel.getFont ().deriveFont (10.0f));
        sobrenomeLabel.setForeground(Color.BLACK);

        sobrenomeInput = new JTextField(30);
        sobrenomeInput.setBounds(290,260,150,20);
        sobrenomeInput.setFont (nomeInput.getFont ().deriveFont (10.0f));
        sobrenomeInput.setForeground(Color.BLACK);

        JLabel emailLabel = new JLabel("Email");
        emailLabel.setBounds(290,290,200,10);
        emailLabel.setFont (emailLabel.getFont ().deriveFont (10.0f));
        emailLabel.setForeground(Color.BLACK);

        emailInput = new JTextField(30);
        emailInput.setBounds(290,300,150,20);
        emailInput.setFont (nomeInput.getFont ().deriveFont (10.0f));
        emailInput.setForeground(Color.BLACK);

        JRadioButton acceptTerms = new JRadioButton("I have read the Terms and Conditions");
        acceptTerms.setSelected(false);
        acceptTerms.setFont (acceptTerms.getFont ().deriveFont (8.0f));
        acceptTerms.setBounds(285,330,200,20);
        acceptTerms.setForeground(Color.GRAY);

        JButton signButton = new JButton("SIGN UP NOW");
        signButton.setBounds(290,380,150,30);


        root.add(back, BorderLayout.EAST);
        root.add(criarConta, BorderLayout.EAST);

        root.add(nomeLabel, BorderLayout.EAST);
        root.add(nomeInput, BorderLayout.EAST);

        root.add(sobrenomeLabel, BorderLayout.EAST);
        root.add(sobrenomeInput, BorderLayout.EAST);

        root.add(emailLabel, BorderLayout.EAST);
        root.add(emailInput, BorderLayout.EAST);

        root.add(signButton, BorderLayout.EAST);
        root.add(acceptTerms, BorderLayout.EAST);


        root.add(sign, BorderLayout.EAST);
        root.add(subtitulo, BorderLayout.WEST);
        root.add(titulo, BorderLayout.WEST);
        root.add(imagem, BorderLayout.WEST);
        root.add(esquerda, BorderLayout.WEST);
        root.add(direita, BorderLayout.EAST);

        setContentPane(root);
    }
    
}