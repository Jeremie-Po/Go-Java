
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloFrame {
    public static void main(String[] args) {
        // Crée une instance de MaFenetre
        // Hello fenetre = new Hello();
        JFrame frame = new JFrame();
        frame.setTitle("Ma première fenêtre");
        // Définit la taille de la fenêtre
        frame.setSize(400, 300);
        // Empêche le redimensionnement de la fenêtre
        frame.setResizable(false);
        // Définit l'opération par défaut lorsque la fenêtre est fermée
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Crée un label avec du texte
        JLabel label = new JLabel("C'est quand même cool d'avoir un exemple...");
        // Ajoute le label à la fenêtre
        frame.add(label);

        // Affiche la fenêtre
        frame.setVisible(true);
    }
}