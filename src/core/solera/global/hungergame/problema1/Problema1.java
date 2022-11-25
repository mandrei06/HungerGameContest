package core.solera.global.hungergame.problema1;

import java.util.Dictionary;
import java.util.Hashtable;

public class Problema1 {

        public static void main(String[] args)
        {
            long number= 514496116026L;
            System.out.println(number);

            Dictionary<Integer,String> alphabet = new Hashtable<>();

            alphabet.put(0," ");
            alphabet.put(1,"a");
            alphabet.put(2,"b");
            alphabet.put(3,"c");
            alphabet.put(4,"d");
            alphabet.put(5,"e");
            alphabet.put(6,"f");
            alphabet.put(7,"g");
            alphabet.put(8,"h");
            alphabet.put(9,"i");
            alphabet.put(10,"j");
            alphabet.put(11,"k");
            alphabet.put(12,"l");
            alphabet.put(13,"m");
            alphabet.put(14,"n");
            alphabet.put(15,"o");
            alphabet.put(16,"p");
            alphabet.put(17,"q");
            alphabet.put(18,"r");
            alphabet.put(19,"s");
            alphabet.put(20,"t");
            alphabet.put(21,"u");
            alphabet.put(22,"v");
            alphabet.put(23,"w");
            alphabet.put(24,"x");
            alphabet.put(25,"y");
            alphabet.put(26,"z");
            int rest;
            char[] myString=new char[30];
            int i=0;
            while(number>0){
                rest= (int) (number%27);
                myString[i++]=alphabet.get(rest).charAt(0);
                number=number/27;

            }
            System.out.println(myString);




        }
    }