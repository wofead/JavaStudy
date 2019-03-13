package DesignModeStudy.DecoratorMode;

public class PersonComponent extends BaseComponent {
    public PersonComponent(String name ){
        super(name);
    }

    public void show(){
        StringBuilder stringBuilder = new StringBuilder("穿衣服的");
        System.out.println(stringBuilder.append(super.name));
    }
}
