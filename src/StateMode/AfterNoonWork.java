package StateMode;

public class AfterNoonWork extends StateMode {
    @Override
    public void state(WorkMode work) {
        if (work.getHour() < 18){
            System.out.println(String.format("当前时间%s,下午工作",work.getHour()));
        }else{
            if(work.isFinish()){
                work.setCurState(new Rest());
                work.state();
            }else{
                work.setCurState(new NightWork());
                work.state();
            }
        }
    }
}
