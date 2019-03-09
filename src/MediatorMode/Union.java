package MediatorMode;

import ChainOfResponsibility.ChainEmployee;

/**
 * @Author: jow
 * @Date: 2019/3/10 0:34
 * @Description
 * @Version 1.0
 */
public abstract class Union extends MediatorMode {
    private America america;
    private China china;
    public void setAmerica(America country){this.america = country;}
    public void setChinaa(China country){this.china = country;}
    @Override
    public void declare(String str, Country country) {
        if (country == america){
            america.getMessage(str);
        }else{
            china.getMessage(str);
        }
    }
}
