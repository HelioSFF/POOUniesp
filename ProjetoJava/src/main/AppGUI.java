package main;

import view.PacienteForm;

import javax.swing.*;

public class AppGUI {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Sistema de Pacientes");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(500, 400);
            frame.setContentPane(new PacienteForm().getPainelPrincipal());
            frame.setVisible(true);
        });
    }
}
