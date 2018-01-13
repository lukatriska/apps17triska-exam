package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyPredicate;

import java.util.ArrayList;
import java.util.List;

// Tests every element and removes it if it doesn't satisfy MyPredicate
public class FilterDecorator extends SmartArrayDecorator
{

    private MyPredicate pr;

    public FilterDecorator(SmartArray sa, MyPredicate pr)
    {
        super(sa);
        this.pr = pr;
    }

    @Override
    public Object[] toArray() {
        Object[] curr = this.smartArray.toArray();
        ArrayList<Object> result = new ArrayList<>();

        for (Object currObj : curr)
        {
            if (pr.test(currObj)) {
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
