package com.company;

public class Muko extends Command
{
    public void hvemErJeg() {

        System.out.println("jeg er en mu-ko");
    }

    @Override
    public void execute()
    {
        hvemErJeg();
    }
}
