package com.elenabalan.projectforeverything.Controller;

public class UseGetMax {
    public int use(int value, ControllerOfEverything controller) {
        int result = controller.getMax(value, 10);
        return result;
    }
}
