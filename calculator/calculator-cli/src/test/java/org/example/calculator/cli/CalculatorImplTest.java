package org.example.calculator.cli;
import static jdk.nashorn.internal.objects.Global.Infinity;
import static org.hamcrest.CoreMatchers.equalTo;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.assertThat;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class CalculatorImplTest {

    @Test
    void add() {
        CalculatorImpl cl = new CalculatorImpl();
        assertThat(3.0, equalTo(cl.add(1.0, 2.0)));
        assertThat(-10.0, equalTo(cl.add(-5.0, -5.0)));
    }

    @Test
    void multiply() {
        CalculatorImpl cl = new CalculatorImpl();
        assertThat(0.0, equalTo(cl.multiply(0.0, 1.0)));
        assertThat(-10.0, equalTo(cl.multiply(2.0, -5.0)));
        assertThat(10.0, equalTo(cl.multiply(2.0, 5.0)));
    }

    @Test
    void substract() {
        CalculatorImpl cl = new CalculatorImpl();
        assertThat(-1.0, equalTo(cl.substract(1.0, 2.0)));
        assertThat(0.0, equalTo(cl.substract(-5.0, -5.0)));
    }

    @Test
    void divide() {
        CalculatorImpl cl = new CalculatorImpl();
        assertThat(3.0, equalTo(cl.divide(9.0, 3.0)));
        assertThat(0.0, equalTo(cl.divide(0.0, 2.0)));
        assertThat(Infinity, equalTo(cl.divide(1.0, 0.0)));

    }
}