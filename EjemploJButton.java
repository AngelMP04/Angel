import javax.swing.*;
import java.awt.event.*;

public class EjemploJButton {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Ejemplo JButton");
        JButton boton = new JButton("Haz clic aquí");

        boton.addActionListener((ActionEvent e) -> {
            JOptionPane.showMessageDialog(frame, "¡Botón presionado!");
        });

        frame.setLayout(new java.awt.FlowLayout());
        frame.add(boton);
        frame.setSize(200, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
