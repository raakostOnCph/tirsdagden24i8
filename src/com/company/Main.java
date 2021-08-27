package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
//	// write your code here
//
//    String s = "hej";
//
//    int [] ints = new int[4];
//
//    Person person = new Person("William", 30);
//
//    ObjInfo.udskrivAdr(person);
//    ObjInfo.udskrivAdr(new Pruhhest());
//    ObjInfo.udskrivAdr(new Muko());
//
//
//    Object [] objects = new Object[3];
//    objects[0] = person;
//    objects[1] = new Muko();
//    objects[2] = new Pruhhest();
//
//
//
//
//        for (Object object : objects) {
//
//            if (object instanceof Muko) {
//
//                ((Muko) object).hvemErJeg();
//            }
//            if (object instanceof Person) {
//
//                ((Person) object).udskrivFelter();
//            }
//            if (object instanceof Pruhhest) {
//                ((Pruhhest) object).jegerEnHest();
//            } // mulighed for at bruge Switch struktur?
//        }
//
//    Command [] commands = new Command[6];
//
//        commands[0] = new Muko();
//        commands[1] = new Person("nik", 50);
//        commands[2] = new Pruhhest();
//        commands[4] = new Muko();
//        commands[3] = new Muko();
//        commands[5] = new Blobfiske();
//
//        List<Command> commandArray = new ArrayList<>(Arrays.asList(commands));
//
//        System.out.println("/n/n nu med arrayliste");
//
//        commandArray.add(new Pruhhest());
//
//        for (Command command : commandArray) {
//
//            command.execute();
//        }
//
//
//        System.out.println("\n\n her gør vi det uden objektdiskriminering");
//
//        for (Command command : commands) {
//
//            command.execute();
//            //Alle objekter bruger Command-interfacet - samme navn, forskellig resultat
//        }
//
//
//        System.out.println("vi prøver lige at udskrive addresserne");
//
//        for (Command command : commandArray) {
//
//            ObjInfo.udskrivAdr(command);
//        }
//
//
// Integer integer = 1;
//
//        ObjInfo.visAlleMetoder(integer);
//
//        ObjInfo.visObjektMetoder(integer);
//
//        ObjInfo.visFelter(person);
//
//        ObjInfo.visSuperKlasse(s);




//
//        String svar = getInput("hvilken type objekt vil du have");
//
//        Object o;
//
//        switch (svar) {
//
//            case "hest":
//                o  =  new Pruhhest();
//                ObjInfo.visSuperKlasse(o);
//            break;
//            case "ko":
//                o= new Muko();
//                ObjInfo.visSuperKlasse(o);
//                break;
//            case "string":
//                o = "";
//                ObjInfo.visSuperKlasse(o);
//
//                break;
//
//            default:
//                 o = new Object();
//
//        }



        ObjInfo objInfo = new ObjInfo();

        ObjInfo.visObjektMetoder(objInfo);

        ObjInfo.visObjektMetoder(objInfo);

        ObjInfo.visKunNedarvedeMetoder(objInfo);



    }   // her slutter min main


    public static String getInput(String s) {

        System.out.print(s + " ");

        Scanner scanner = new Scanner(System.in);

        return scanner.next();


    }

}
