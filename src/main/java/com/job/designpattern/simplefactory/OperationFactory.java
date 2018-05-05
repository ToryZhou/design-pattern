package com.job.designpattern.simplefactory;

public class OperationFactory {

    public static final String ADD = "+";
    public static final String SUB = "-";
    public static final String MUL = "*";
    public static final String DIV = "/";

    public static Operation createOperation(String type) {
        Operation operation = null;
        switch (type) {
            case ADD:
                operation = new OperationAddition();
                break;
            case SUB:
                operation = new OperationSubtraction();
                break;
            case MUL:
                operation = new OperationMultiplication();
                break;
            case DIV:
                operation = new OperationDivision();
                break;
            default:
        }
        return operation;
    }
}
