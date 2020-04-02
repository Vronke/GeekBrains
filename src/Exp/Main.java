package Exp;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        question1();
        question2();
    }

    public static void question1(){
        String[] arrayStr = new String[]{"apple", "home", "human", "chair", "idea", "game", "apple", "human", "apple", "idea", "apple", "snake"};


        boolean IsContains = false;
        ArrayList<String> goodArray = new ArrayList<>();
        for (int i = 0; i < arrayStr.length; i++) {
            for (String s :
                    goodArray) {
                if (s.equals(arrayStr[i])){
                    IsContains = true;
                    break;
                }
            }
            if (!IsContains)
                goodArray.add(arrayStr[i]);
        }

        for (String s :
                goodArray) {
            int count = 0;
            for (int i = 0; i < arrayStr.length; i++) {
                if (s.equals(arrayStr[i]))
                    count++;
            }
            System.out.println(s + ": " + count);
        }
    }

    public static void question2(){
        Directory dir = new Directory();
        dir.add("name1", "88005553535");
        dir.add("name2", "89009009090");
        dir.add("name3", "89553553535");
        dir.add("name2", "89123456789");
        dir.add("name4", "89659659595");
        dir.add("name5", "89095209874");
        dir.add("name6", "89014230974");

        dir.get("name2");
    }
}
