package Proxy;

public class Pursuit implements IGiveGift,Cloneable {
    private Girl girl;
    public Pursuit(Girl girl){
        this.girl = girl;
    }
    @Override
    public void giveDoll() {
        System.out.println("送洋娃娃给" + girl.getName());
    }

    @Override
    public void giveCard() {
        System.out.println("送贺卡给" + girl.getName());
    }

    @Override
    public void giveFlower() {
        System.out.println("送花给" + girl.getName());
    }

    public Object clone() throws CloneNotSupportedException{
//        如果类中有自定义类 也要在自定义类中进行cloneable接口的引用
//        而且在聚合类的clone函数中进行调用赋值
//        基本数据类型会进行深拷贝
       return super.clone();
    }
}
