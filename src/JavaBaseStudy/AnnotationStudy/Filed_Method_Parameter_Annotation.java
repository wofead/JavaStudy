package JavaBaseStudy.AnnotationStudy;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: jow
 * @Date: 2019/3/25 20:54
 * @Description
 * @Version 1.0
 */
@Target({ElementType.FIELD,ElementType.METHOD,ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface Filed_Method_Parameter_Annotation {
    String describe();
    Class type() default void.class;
}
