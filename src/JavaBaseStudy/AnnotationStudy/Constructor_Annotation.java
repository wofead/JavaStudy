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
@Target(ElementType.CONSTRUCTOR)
@Retention(RetentionPolicy.RUNTIME)
public @interface Constructor_Annotation {
    String value() default "默认构造方法";
}
