package Proxy;

public class Pursuit implements IGiveGift {
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

    public Pursuit clone(){
        return this.clone();
    }
}
