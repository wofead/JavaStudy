package DesignModeStudy.Proxy;

public class ProxyPerson implements IGiveGift {
    private Pursuit pursuit;
    public ProxyPerson(Pursuit pursuit){
        this.pursuit = pursuit;
    }
    @Override
    public void giveDoll() {
        pursuit.giveDoll();
    }

    @Override
    public void giveCard() {
        pursuit.giveCard();
    }

    @Override
    public void giveFlower() {
        pursuit.giveFlower();
    }
}
