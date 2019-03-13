package DesignModeStudy.MediatorMode;

/**
 * @Author: jow
 * @Date: 2019/3/10 0:29
 * @Description
 * @Version 1.0
 */
public class Country {
    protected MediatorMode union;
    public Country(MediatorMode union){
        this.union = union;
    }
}
