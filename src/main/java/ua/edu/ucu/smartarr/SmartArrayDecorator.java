package ua.edu.ucu.smartarr;

abstract class SmartArrayDecorator implements SmartArray {

    protected SmartArray smartArray;

    @Override
    public abstract Object[] toArray();

    public SmartArrayDecorator(SmartArray smartArray) {
        this.smartArray = smartArray;
    }
}
