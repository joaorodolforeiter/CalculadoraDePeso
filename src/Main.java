import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException
                | UnsupportedLookAndFeelException e) {
            throw new RuntimeException(e);
        }

        JFrame frame = new JFrame("Calculadora Geral");

        frame.setMinimumSize(new Dimension(400, 300));
        frame.setResizable(false);
        frame.getContentPane().setLayout(new GridLayout(4, 2));

        JTextField pesoInput = new JTextField(50);
        JButton calcButton = new JButton("Calcular Peso");
        JLabel pesoLabel = new JLabel("Seu peso é ∞", SwingConstants.CENTER);
        JTextField alturaInput = new JTextField(50);
        JButton calcAltButton = new JButton("Calcular Altura");
        JLabel alturaLabel = new JLabel("Sua altura é ∞", SwingConstants.CENTER);

        calcButton.addActionListener(actionEvent -> {
            if (pesoInput.getText().matches("-?\\d+(,\\d+)?"))
                pesoLabel.setText("Seu peso é " + pesoInput.getText() + " Kg");
            else
                System.out.println("Não é possível inserir letras.");
        });
        calcAltButton.addActionListener(actionEvent -> {
            if (alturaInput.getText().matches("-?\\d+(,\\d+)?"))
                alturaLabel.setText("Sua altura é " + alturaInput.getText() + " cm");
            else
                System.out.println("Não é possível inserir letras.");
        });
        frame.add(new JLabel("Digite seu peso:", SwingConstants.CENTER));
        frame.add(new JLabel("Digite sua altura:", SwingConstants.CENTER));
        frame.add(pesoInput);
        frame.add(alturaInput);
        frame.add(calcButton);
        frame.add(calcAltButton);
        frame.add(pesoLabel);
        frame.add(alturaLabel);

        frame.setVisible(true);
    }
}
