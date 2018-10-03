
package main;

import view.ViewE;
import model.ModelE;
import Controller.ControllerE;

public class MainE {
    private static ViewE viewE;
    private static ModelE modelE;
    private static ControllerE controllerE;
    
    public static void main(String[] args)
    {
        viewE = new ViewE();
        modelE = new ModelE();
        controllerE = new ControllerE(modelE, viewE);
    }
}