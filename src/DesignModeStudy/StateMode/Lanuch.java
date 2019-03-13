package DesignModeStudy.StateMode;

public class Lanuch extends StateMode {
    @Override
    public void state(WorkMode work) {
        if (work.getHour() < 14){
            System.out.println(String.format("当前时间%s,吃午饭",work.getHour()));
        }else{
            work.setCurState(new AfterNoonWork());
            work.state();
        }
    }
}
