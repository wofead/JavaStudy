package DecoratorMode;

public class DecoratorTest {
    PersonComponent person = new PersonComponent("Jow");
    Coat coat = new Coat();
    Jeans jeans = new Jeans();
    T_Shirt t_shirt = new T_Shirt();
    public void firstClothes(){
        t_shirt.decorate(jeans);
        jeans.decorate(coat);
        coat.decorate(person);
        t_shirt.show();
    }

    public void secondClothes(){
        t_shirt.decorate(jeans);
        jeans.decorate(person);
        coat.decorate(t_shirt);
        coat.show();
    }
}
