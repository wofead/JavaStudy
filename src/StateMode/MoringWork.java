package StateMode;

public class MoringWork extends StateMode {
    @Override
    public void state(WorkMode work) {
        if (work.getHour() < 12){
            System.out.println(String.format("当前时间%s,早上工作",work.getHour()));
        }else{
            work.setCurState(new Lanuch());
            work.state();
        }
    }
}
