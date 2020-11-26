package src.loadingscreen;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import src.navigation.AppNavigation;

public class LoadController {

    private LoadView view;

    public LoadController(LoadView view) {
        this.view = view;
        this.view.setEnterBtnActionListener(new EnterBtnActionListener());
        view.setVisible(true);
    }

    public static class EnterBtnActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            AppNavigation.converter();
        }

    }

}
