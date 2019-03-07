package DecoratorMode;

public class Clothes extends BaseComponent {
    private BaseComponent component;

    public Clothes(String name) {

        super.name = name;
    }

    public void show() {
        super.show();
        if (component != null) {
            component.show();
        }
    }

    public void decorate(BaseComponent component) {
        this.component = component;
    }
}
