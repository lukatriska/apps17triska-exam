package ua.edu.ucu.smartarr;

import java.util.ArrayList;
import java.util.Collections;

// Base array for decorators
public class BaseArray implements SmartArray
{

    private Object[] array;

    public BaseArray(Object[] array) {
        this.array = array;
    }

    @Override
    public Object[] toArray()
    {
        return array;
    }

    @Override
    public String operationDescription()
    {
        return "HEELOU";
    }

    @Override
    public int size()
    {
        return this.array.length;
    }
}
