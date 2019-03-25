package JavaBaseStudy.ReflectIonStudy;

import java.lang.reflect.Constructor;

public class ReflectionOfJava {
    public void testConstruct(){
        ReflectExample example = new ReflectExample("1","2","3");
        Class<? extends ReflectExample> exampleC = example.getClass();
        Constructor<?>[] constructors = exampleC.getDeclaredConstructors();
        for (int i = 0; i < constructors.length; i++) {
            Constructor<?> constructor = constructors[i];
            Class[] paramTypes = constructor.getParameterTypes();
            System.out.println("该构造方法的参数类型:");
            for (int j = 0; j < paramTypes.length; j++) {
                System.out.println("" + paramTypes[j]);
            }
            ReflectExample example1 = null;
            while (example1 == null){
                try {
                    if (i == 2)
                        example1 = (ReflectExample)constructor.newInstance();
                    else if (i == 1){
                        example1 = (ReflectExample)constructor.newInstance("7",5);
                    }else
                        example1 = (ReflectExample)constructor.newInstance(new Object[]{new String[]{"10","200","300"}});
                }catch (Exception e){
                    System.out.println("创建时发生异常，下面设置setAccessible");
                    e.printStackTrace();
                    constructor.setAccessible(true);
                }
            }
            if (example1 != null){
                example1.printConstuctors();
            }
        }
    }
}
