package BuilderMode;

public class ModeDirector {
    public ModeDirector() {
    }
    public void construct(ModeBuilder modeBuilder){
        modeBuilder.buildPartA();
        modeBuilder.buildPartB();
    }
}
