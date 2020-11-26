package src.converter;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class ConverterView extends JFrame {

    private static final long serialVersionUID = 1L;
    private ConversorModel model;
    private JTextField converter;
    private JTextField celsiusToFahrenheit;
    private JTextField celsiusToKelvin;
    private JTextField fahrenheitToCelsius;
    private JTextField fahrenheitToKelvin;
    private JTextField kelvinToCelsius;
    private JTextField kelvinToFahrenheit;
    private JButton calculteBtn;

    public ConverterView(ConversorModel model) {
        this.model = model;
        setTitle("Converter");
        setSize(530,850);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setResizable(false);

        Converter();

        setVisible(true);
    }

    private void Converter() {
        JPanel root = new JPanel();
        root.setLayout(new BorderLayout());
        ImageIcon image = new ImageIcon("assets/imgs/main.png");
        JLabel background = new JLabel(image);

        converter = new JTextField(6);
        converter.setBounds(130,180,180,70);
        converter.setFont (converter.getFont ().deriveFont(75.0f));
        converter.setBorder(null);
        converter.setBackground(new Color(108,99,255));


        calculteBtn = new JButton("➾");
        calculteBtn.setBounds(310,180,90,70);
        calculteBtn.setFont(calculteBtn.getFont() . deriveFont(40.f));
        calculteBtn.setBorder(null);
        calculteBtn.setBackground(new Color(108,99,255));

        celsiusToKelvin = new JTextField(6);
        celsiusToKelvin.setBounds(280,340,200,60);
        celsiusToKelvin.setFont (celsiusToKelvin.getFont ().deriveFont (40.0f));
        celsiusToKelvin.setOpaque(false);
        celsiusToKelvin.setBorder(null);

        celsiusToFahrenheit = new JTextField(6);
        celsiusToFahrenheit.setBounds(280,405,200,60);
        celsiusToFahrenheit.setFont (celsiusToFahrenheit.getFont ().deriveFont (40.0f));
        celsiusToFahrenheit.setOpaque(false);
        celsiusToFahrenheit.setBorder(null);

        kelvinToFahrenheit = new JTextField(6);
        kelvinToFahrenheit.setBounds(280,510,200,60);
        kelvinToFahrenheit.setFont (kelvinToFahrenheit.getFont ().deriveFont (40.0f));
        kelvinToFahrenheit.setOpaque(false);
        kelvinToFahrenheit.setBorder(null);

        kelvinToCelsius = new JTextField(6);
        kelvinToCelsius.setBounds(280,572,200,60);
        kelvinToCelsius.setFont (kelvinToCelsius.getFont ().deriveFont (40.0f));
        kelvinToCelsius.setOpaque(false);
        kelvinToCelsius.setBorder(null);

        fahrenheitToKelvin = new JTextField(6);
        fahrenheitToKelvin.setBounds(280,663,200,60);
        fahrenheitToKelvin.setFont (fahrenheitToKelvin.getFont ().deriveFont (40.0f));
        fahrenheitToKelvin.setOpaque(false);
        fahrenheitToKelvin.setBorder(null);

        fahrenheitToCelsius = new JTextField(6);
        fahrenheitToCelsius.setBounds(280,729,200,60);
        fahrenheitToCelsius.setFont (fahrenheitToCelsius.getFont ().deriveFont (40.0f));
        fahrenheitToCelsius.setOpaque(false);
        fahrenheitToCelsius.setBorder(null);

        root.add(converter);
        root.add(calculteBtn);
        root.add(celsiusToFahrenheit);
        root.add(celsiusToKelvin);
        root.add(fahrenheitToKelvin);
        root.add(fahrenheitToCelsius);
        root.add(kelvinToCelsius);
        root.add(kelvinToFahrenheit);
        root.add(background);

        setContentPane(root);
    }

    public String getConverter(){
        return converter.getText();
    }

    public void setConvertions(){
        DecimalFormat pattern = new DecimalFormat("0.0");

        celsiusToFahrenheit.setText(pattern.format(model.getCelToFah()));
        celsiusToKelvin.setText(pattern.format(model.getCeToKel()));
        fahrenheitToKelvin.setText(pattern.format(model.getFahToKel()));
        fahrenheitToCelsius.setText(pattern.format(model.getFahToCel()));
        kelvinToFahrenheit.setText(pattern.format(model.getKelToFah()));
        kelvinToCelsius.setText(pattern.format(model.getKelToCel()));
    }

    public void setCalculteBtnActionListener(ActionListener action){
        calculteBtn.addActionListener(action);
    }

}