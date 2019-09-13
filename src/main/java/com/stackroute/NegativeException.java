package com.stackroute;

public class NegativeException {

    public void negativemethod() throws Exception
    {
        throw new NegativeArraySizeException();
    }
    public void indexmethod() throws Exception
    {
        throw new IndexOutOfBoundsException();
    }
    public void nullmethod() throws Exception
    {
        throw new NullPointerException();
    }
}

