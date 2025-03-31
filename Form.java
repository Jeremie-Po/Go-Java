import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form {
    public static void main(String[] args) {
        // Crée une instance de JFrame
        JFrame frame = new JFrame("Formulaire");

        // Crée un panel pour contenir les composants
        JPanel panel = new JPanel();

        // Crée un champ de texte
        JTextField textField = new JTextField(20);
        panel.add(textField);

        // Crée un bouton
        JButton button = new JButton("Soumettre");
        panel.add(button);

        // Ajoute un écouteur d'événements au bouton
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Affiche une alerte au moment de la soumission
                JOptionPane.showMessageDialog(frame, "Formulaire soumis avec la valeur : " + textField.getText());
            }
        });

        // Ajoute le panel à la fenêtre
        frame.add(panel);

        // Définit la taille de la fenêtre
        frame.setSize(300, 200);

        // Affiche la fenêtre
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}