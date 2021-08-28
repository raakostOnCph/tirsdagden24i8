package com.company;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import static com.company.Main.getInput;

public class ObjInfo
{


    public static void udskrivAdr(Object o)
    {

        System.out.println("udskriver adr : " + o.hashCode());

    }

    public static Set<String> alleObjectMetoder(Object o)
    {

        Set<String> stringSet = new HashSet<>();

        System.out.println("\n\n udskriver objektets metoder");
        Method[] methods = o.getClass().getMethods();

        for (Method method : methods) {

            stringSet.add(method.getName());
            // System.out.println(method.getName());
        }

        return stringSet;
    }

    public void visAlleMetoder(Object o)
    {

        Set<String> stringSet = alleObjectMetoder(o);

        for (String s : stringSet) {

            System.out.println(s);
        }

    }


    public static Set<String> objektMetoder(Object o)
    {


        Set<String> stringSet = new HashSet<>();

        Method[] methods = o.getClass().getDeclaredMethods();

        System.out.println("\n\n viser metoder på objektet kun");

        for (Method method : methods) {

            stringSet.add(method.getName());
            //  System.out.println(method.getName());
        }

        return stringSet;
    }

    public static void visObjektMetoder(Object o)
    {

        Set<String> stringSet = objektMetoder(o);

        for (String s : stringSet) {
            System.out.println(s);
        }

    }


    public static void visFelter(Object o)
    {

        System.out.println("\n\n udskriver felter");

        Field[] fields = o.getClass().getDeclaredFields();


        for (Field field : fields) {

            System.out.println(field.getName());
        }

    }

    public static void visSuperKlasse(Object o)
    {

        System.out.println("\n\n viser super klassen ");

        System.out.println(o.getClass().getSimpleName() + " ---------->   " + o.getClass().getSuperclass().getSimpleName());


    }

    public static void demo()
    {


    }

    public static void visKunNedarvedeMetoder(Object o)
    {

        Set<String> klasseMetoder = objektMetoder(o);
        Set<String> alleMetoder = ObjInfo.alleObjectMetoder(o);

        alleMetoder.removeAll(klasseMetoder);

        for (String s : alleMetoder) {

            System.out.println(s);
        }

    }

    public static void udskrivheleKlasseHerakiet(Map<String, Object> objectMap)
    {


        Object o = objectMap.getOrDefault(getInput("skriv en klasse"), new Object());

        Class<?> obj = o.getClass();
        System.out.println(obj.getSimpleName());

        while (true) {

            obj = obj.getSuperclass();
            System.out.println(obj.getSimpleName());
            if (obj.getSimpleName().equals("Object")) {
                break;
            }


        }

    }

}
