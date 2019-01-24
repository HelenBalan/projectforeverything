package com.elenabalan.projectforeverything.Controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UseGetMaxTest {
    @Mock
    ControllerOfEverything controllerMoc;

    @Test
    public void use() {
//        ControllerOfEverything controllerMoc = Mockito.mock(ControllerOfEverything.class);
        when(controllerMoc.getMax(1,10)).thenReturn(10);
        when(controllerMoc.getMax(20,10)).thenReturn(20);
        UseGetMax useGetMax = new UseGetMax();
        int result = useGetMax.use(1,controllerMoc);
        assertEquals("Wrong! Not 10.", 10, result);
        result = useGetMax.use(20,controllerMoc);
        assertEquals("Wrong! Not 20", 20,result);
    }
}