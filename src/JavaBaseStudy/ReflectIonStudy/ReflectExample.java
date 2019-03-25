package JavaBaseStudy.ReflectIonStudy;

public class ReflectExample {
    String s;
    int i,j,k;
    private ReflectExample(){}
    protected ReflectExample(String s,int  i){
        this.s = s;
        this.i = i;
    }

    public ReflectExample(String ... strings) throws NumberFormatException{
        if (0 < strings.length)
            i = Integer.valueOf(strings[0]);
        if (1 < strings.length)
            j = Integer.valueOf(strings[1]);
        if (2 < strings.length)
            k = Integer.valueOf(strings[2]);
    }

    public void printConstuctors(){
        System.out.println("s=" + s);
        System.out.println("i=" + i);
        System.out.println("j=" + j);
        System.out.println("k=" + k);
    }
}
