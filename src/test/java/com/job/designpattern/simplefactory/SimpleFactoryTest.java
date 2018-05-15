package com.job.designpattern.simplefactory;


import org.junit.Assert;
import org.junit.Test;

public class SimpleFactoryTest {
    @Test
    public void test() {
        testOperation(OperationFactory.ADD, 32.5, 17.5, 50);
        testOperation(OperationFactory.SUB, 32.5, 17.5, 15);
        testOperation(OperationFactory.MUL, 5, 2.5, 12.5);
        testOperation(OperationFactory.DIV, 5, 2.5, 2);
    }

    private void testOperation(String type, double numberA, double numberB, double expected) {
        Operation operation = OperationFactory.createOperation(type);
        operation.setNumberA(numberA);
        operation.setNumberB(numberB);
        Assert.assertEquals(expected, operation.calculate(), 0);
    }
}
