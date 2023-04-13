package de.ebcsoft.Project;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewWindow extends JFrame {

    private EnergyReadingData energyReading; // Referencia al objeto EnergyReading
    public NewWindow(EnergyReadingData energyReading) { //este es el constructor
        // Configurar la ventana
        super("Ventana Nueva");
        setSize(400, 300);
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Guardar la referencia al objeto EnergyReading
        this.energyReading = energyReading;

        // Crear los componentes
        JLabel label = new JLabel("Bitte geben Sie den Energieverbrauch ein:");
        JTextField textField = new JTextField(10);
        JButton button = new JButton("Submit");

        // Agregar los componentes a la ventana
        JPanel panel = new JPanel(new FlowLayout());
        panel.add(label);
        panel.add(textField);
        panel.add(button);
        setContentPane(panel);

        // Agregar un ActionListener al botón "Submit"

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Obtener el valor del campo de texto y guardarlo en el objeto energyReading
                String text = textField.getText();
                try {
                    double value = Double.parseDouble(text);
                    energyReading.setEnergyConsumption(value);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(ProjectApplication,
                            "Bitte geben Sie eine gültige Zahl ein.",
                            "Ungültiger Wert",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }


}