package DesignModeStudy.BuilderMode;

public class ModeBuilderB extends ModeBuilder {
    private ModeProduct modeProduc;
    public ModeBuilderB() {
        modeProduc = new ModeProduct();
    }

    @Override
    public void buildPartA() {
        modeProduc.add("PartC");
    }

    @Override
    public void buildPartB() {
        modeProduc.add("PartV");
    }

    @Override
    public ModeProduct getResult() {
        return modeProduc;
    }
}
