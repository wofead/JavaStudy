package StateMode;

public class NightWork extends StateMode {
    @Override
    public void state(WorkMode work) {
        if (work.getHour() < 22){
            System.out.println(String.format("现在时间%s,晚上工作",work.getHour()));
        }else{
            work.setCurState(new Rest());
            work.state();
        }
    }
}
