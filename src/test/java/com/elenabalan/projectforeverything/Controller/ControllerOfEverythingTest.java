package com.elenabalan.projectforeverything.Controller;

import org.junit.Test;

import static org.junit.Assert.*;

public class ControllerOfEverythingTest {

    @Test
    public void getMax() {
        ControllerOfEverything controller = new ControllerOfEverything();
        int result;
        result = controller.getMax(1,2);
        assertEquals("What's going on?",2,result);

        result = controller.getMax(2,1);
        assertEquals("What's going on again?",2,result);
    }
}