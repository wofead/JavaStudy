package DesignModeStudy.BuilderMode;

import java.util.Arrays;

public class ModeProduct {
    private String [] strings = new String[5];
    public void add(String string){
        Arrays.fill(strings,string);
    }

    public void show(){
        System.out.println("产品的生产：");
        for (String string:strings){
            System.out.println(string);
        }
    }

}
