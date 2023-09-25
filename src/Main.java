import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException |
                 UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }

        JFrame frame = new JFrame("Calculadora de Peso");

        frame.setMinimumSize(new Dimension(400, 300));
        frame.setResizable(false);
        frame.getContentPane().setLayout(new GridLayout(4, 0));

        JTextField pesoInput = new JTextField(50);
        JButton calcButton = new JButton("Calcular Peso");
        JLabel pesoLabel = new JLabel("Seu peso é ∞", SwingConstants.CENTER);

        calcButton.addActionListener(actionEvent -> {
            if (pesoInput.getText().matches("-?\\d+(,\\d+)?"))
                pesoLabel.setText("Seu peso é " + pesoInput.getText() + " Kg");
            else System.out.println("Seu pobre");
        });
        frame.add(new JLabel("Digite seu peso:", SwingConstants.CENTER));
        frame.add(pesoInput);
        frame.add(calcButton);
        frame.add(pesoLabel);

        frame.setVisible(true);
    }
}