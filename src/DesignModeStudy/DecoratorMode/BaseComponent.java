package DesignModeStudy.DecoratorMode;

public class BaseComponent {
    public BaseComponent(){}
    public String name;
    public BaseComponent(String name){
        this.name = name;
    }

    public void show(){
        System.out.println(name);
    }
}
