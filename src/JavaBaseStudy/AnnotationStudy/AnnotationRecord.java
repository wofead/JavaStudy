package JavaBaseStudy.AnnotationStudy;

/**
 * @Author: jow
 * @Date: 2019/3/25 20:59
 * @Description
 * @Version 1.0
 */
public class AnnotationRecord {
    @Filed_Method_Parameter_Annotation(describe = "编号",type = int.class)
    int id;
    @Filed_Method_Parameter_Annotation(describe = "名字",type = String.class)
    String name;
    @Constructor_Annotation()
    public AnnotationRecord(){}
    @Constructor_Annotation("立即初始化构造方法")
    public AnnotationRecord(@Filed_Method_Parameter_Annotation(describe = "编号",type = int.class) int id,
                            @Filed_Method_Parameter_Annotation(describe = "名字",type = String.class) String name){
        this.id = id;
        this.name = name;
    }
    @Filed_Method_Parameter_Annotation(describe = "获得编号", type = int.class)
    public int getId(){
        return this.id;
    }
    @Filed_Method_Parameter_Annotation(describe = "设置编号")
    public void setId(@Filed_Method_Parameter_Annotation(describe = "编号",type = int.class) int id){
        this.id = id;
    }
    @Filed_Method_Parameter_Annotation(describe = "获得名字", type = String.class)
    public String getName(){
        return this.name;
    }
    @Filed_Method_Parameter_Annotation(describe = "设置名字")
    public void setName(@Filed_Method_Parameter_Annotation(describe = "名字",type = String.class) String name){
        this.name = name;
    }
}
