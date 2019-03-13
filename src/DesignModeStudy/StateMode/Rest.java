package DesignModeStudy.StateMode;

public class Rest extends StateMode {
    @Override
    public void state(WorkMode work) {
        if (work.getHour() < 24){
            System.out.println(String.format("当前时间%s,休息",work.getHour()));
        }else{
            System.out.println("今天已经结束");
        }
    }
}
