package src.converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConversorController {

    private final ConversorModel model;
    private ConverterView view;

    public ConversorController(ConverterView view, ConversorModel model) {
        this.model = model;
        this.view = view;
        this.view.setCalculteBtnActionListener(new ConfirmButtonActionListener());
        this.view.setVisible(true);

    }

    public void convert(){
        Double valor = Double.parseDouble(view.getConverter());
        model.celsius(valor);
        model.fahrenheit(valor);
        model.kelvin(valor);

        view.setConvertions();

    }

    public class ConfirmButtonActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            convert();
        }

    }

}
