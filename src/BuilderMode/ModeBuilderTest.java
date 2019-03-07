package BuilderMode;

public class ModeBuilderTest {
    private ModeBuilder modeBuilderA = new ModeBuilderA();
    private ModeBuilder modeBuilderB = new ModeBuilderB();
    private ModeDirector modeDirector;
    public ModeBuilderTest() {
        modeDirector = new ModeDirector();
    }
    public void show(){
        modeDirector.construct(modeBuilderA);
        modeDirector.construct(modeBuilderB);
        ModeProduct productA = modeBuilderA.getResult();
        ModeProduct productB = modeBuilderB.getResult();
        productA.show();
        productB.show();
    }

}
