package DesignModeStudy.BuilderMode;

public class ModeBuilderA extends ModeBuilder {
    private ModeProduct modeProduc;
    public ModeBuilderA() {
        modeProduc = new ModeProduct();
    }

    @Override
    public void buildPartA() {
        modeProduc.add("PartA");
    }

    @Override
    public void buildPartB() {
        modeProduc.add("PartB");
    }

    @Override
    public ModeProduct getResult() {
        return modeProduc;
    }
}
