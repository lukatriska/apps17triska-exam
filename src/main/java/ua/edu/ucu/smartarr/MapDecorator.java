package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyFunction;

import java.util.ArrayList;
import java.util.List;

// Map every element to another object using MyFunction
public class MapDecorator extends SmartArrayDecorator
{

    private MyFunction func;

    public MapDecorator(SmartArray sa, MyFunction func)
    {
        super(sa);
        this.func = func;
    }

    @Override
    public Object[] toArray() {
        Object[] curr = this.smartArray.toArray();
        ArrayList<Object> result = new ArrayList<>();

        for (Object currObj : curr) {
            result.add(func.apply(currObj));
        }

        return result.toArray(new Object[result.size()]);
    }
    @Override
    public String operationDescription()
    {
        return null;
    }

    @Override
    public int size()
    {
        return this.smartArray.size();
    }
}
