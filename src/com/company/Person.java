package com.company;

public class Person extends Command
{

    String navn;
    int alder;

    public Person(String navn, int alder)
    {
        this.navn = navn;
        this.alder = alder;
    }

    public void udskrivFelter() {

        System.out.println("der er ikke nogen felter endnu");

    }

    @Override
    public void execute()
    {
        udskrivFelter();
    }
}
