package org.lightcycle.spike.jerseyjsonio;

public class ExampleResponseObject {
    private ExampleRequestObject param;
    private String name;
    private int number;

    public ExampleResponseObject(ExampleRequestObject param, String name, int number) {
        this.param = param;
        this.name = name;
        this.number = number;
    }
}
