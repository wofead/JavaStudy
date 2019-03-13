package DesignModeStudy.StateMode;

public class WorkMode {
    private StateMode curState;
    private int hour;
    private boolean finish = false;


    public WorkMode() {
        curState = new MoringWork();
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    public void setCurState(StateMode state){
        this.curState = state;
    }

    public void state(){
        this.curState.state(this);
    }
}
