package JavaBaseStudy.AnnotationStudy;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;

/**
 * @Author: jow
 * @Date: 2019/3/25 21:09
 * @Description
 * @Version 1.0
 */
public class AnnotationTest {
    //    Class<?> recordC = Class.forName("AnnotationRecord"); 可以通过AnnotationRecord的全路径来获取到Class
    public void constructTest() {
        Class<?> recordC = AnnotationRecord.class;
        Constructor[] constructors = recordC.getDeclaredConstructors();
        for (int i = 0; i < constructors.length; i++) {
            Constructor constructor = constructors[i];
            if (constructor.isAnnotationPresent(Constructor_Annotation.class)) {
                Constructor_Annotation constructor_annotation = (Constructor_Annotation) constructor.getAnnotation(Constructor_Annotation.class);
                System.out.println(constructor_annotation.value());
            }
            //一个参数可能有多个注解 Repeatable就可以，或者使用数组FilterPath[] value();
//            第一位为几个参数，二为注解中成员的个数
            Annotation[][] parameterAnnotations = constructor.getParameterAnnotations();
            for (int j = 0; j < parameterAnnotations.length; j++) {
                int length = parameterAnnotations[j].length;
                if (length == 0){
                    System.out.println("未添加Annotation注解");
                }
                for (int k = 0; k < length; k++) {
                    Filed_Method_Parameter_Annotation ca = (Filed_Method_Parameter_Annotation)parameterAnnotations[j][k];
                    System.out.print("   "+ca.describe());
                    System.out.print("   "+ca.type());
                }
            }
        }
    }

    //方法和成员很像 按照这种写法进行书写

}
