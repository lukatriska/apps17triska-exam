package ua.edu.ucu.smartarr;

import java.util.*;

// Remove duplicates from SmartArray. Use method equals() to compare objects
public class DistinctDecorator extends SmartArrayDecorator {

    public DistinctDecorator(SmartArray smartArray)
    {
        super(smartArray);
    }

    @Override
    public Object[] toArray()
    {

        Object[] curr = this.smartArray.toArray();
        ArrayList<Object> result = new ArrayList<>();

        for (Object currObj : curr) {
            if (!result.contains(currObj)) {
                result.add(currObj);
            }
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
