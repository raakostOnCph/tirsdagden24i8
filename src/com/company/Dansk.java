package com.company;

public class Dansk extends Dailog
{
    @Override
    public String welcome()
    {
        return "hej og velkommen";
    }

    @Override
    public String quit()
    {
        return "tryk q for at stoppe";
    }

    @Override
    public String selectObject()
    {
        return "skrive navnet på typpen af det objekt du vil undersøge";
    }
}
