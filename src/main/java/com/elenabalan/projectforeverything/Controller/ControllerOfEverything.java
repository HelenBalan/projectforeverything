package com.elenabalan.projectforeverything.Controller;

import org.springframework.web.bind.annotation.*;

public class ControllerOfEverything {

    public int getMax(int x, int y){

        int result = x;

        if (y>result) {
            result = y;
        }
        return result;
    }

    public void printSmthToConcole(int smth){

    }
}
