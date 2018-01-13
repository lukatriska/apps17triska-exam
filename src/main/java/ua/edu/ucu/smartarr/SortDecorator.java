package ua.edu.ucu.smartarr;

import ua.edu.ucu.functions.MyComparator;

import java.util.Arrays;

// Sorts elements using MyComparator to compare them
public class SortDecorator extends SmartArrayDecorator
{

    private MyComparator cmp;

    public SortDecorator(SmartArray sa, MyComparator cmp)
    {
        super(sa);
        this.cmp = cmp;
    }

    @Override
    public Object[] toArray()
    {
        Object[] arr = this.smartArray.toArray();
        Arrays.sort(arr);
        return arr;
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
