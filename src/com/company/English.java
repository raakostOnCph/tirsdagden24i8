package com.company;

public class English extends Dailog
{
    @Override
    public String welcome()
    {
        return "hi welcome  !";
    }

    @Override
    public String quit()
    {
        return "press q to quit";
    }

    @Override
    public String selectObject()
    {
        return "enter the type of object you want to analyse";
    }
}
