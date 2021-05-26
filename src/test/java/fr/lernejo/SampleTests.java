package fr.lernejo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTest {
    public Sample sampleTest = new Sample();

    @Test
    void oppAddTest() {
        Assertions.assertEquals(sampleTest.op(Sample.Operation.ADD, 1, 1), 2);
    }

    @Test
    void oppMultiplyTest() {
        Assertions.assertEquals(sampleTest.op(Sample.Operation.MULT, 2, 2), 4);
    }

    @Test
    void factZeroTest() {
        Assertions.assertEquals(sampleTest.fact(0), 1);
    }

    @Test
    void factFiveTest() {
        Assertions.assertEquals(sampleTest.fact(5), 120);
    }

    @Test
    void factErrorTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            sampleTest.fact(-1);
        });
    }
}
