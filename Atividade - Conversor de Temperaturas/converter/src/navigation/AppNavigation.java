package src.navigation;

import src.converter.ConversorController;
import src.converter.ConversorModel;
import src.converter.ConverterView;
import src.loadingscreen.LoadView;
import src.loadingscreen.LoadController;

public class AppNavigation {

    public static void load(){
        new LoadController(new LoadView());
    }
    
    public static void converter(){
        ConversorModel conversorModel = new ConversorModel();
        new ConversorController(new ConverterView(conversorModel), conversorModel);
    }

}
