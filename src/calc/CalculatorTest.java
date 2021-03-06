package calc;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @org.junit.jupiter.api.Test
    void testAdd() {
        Calculator t1 = new Calculator(1,8);
        assertEquals(9.0, t1.add());
    }

    @org.junit.jupiter.api.Test
    void testSub() {
        Calculator t1 = new Calculator(15,7);
        assertEquals(8.0, t1.sub());
    }

    @org.junit.jupiter.api.Test
    void testMult() {
        Calculator t1 = new Calculator(0,21);
        assertEquals(0.0, t1.mult());
    }

    @org.junit.jupiter.api.Test
    void testDiv() {
        Calculator t1 = new Calculator(6,1.5);
        assertEquals(4.0, t1.div());
    }

    @org.junit.jupiter.api.Test
    void testAdd_nds() {
        Calculator t1 = new Calculator(70000,10);
        assertEquals(7000.0, t1.add_nds());
    }

    @org.junit.jupiter.api.Test
    void testSub_nds() {
        Calculator t1 = new Calculator(70000,10);
        assertEquals(6363.636363636368, t1.sub_nds());
    }
}