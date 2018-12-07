package classloaders;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestClassLoader {
    public static void main(String as[]) throws InstantiationException, IllegalAccessException,
            NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        CustomClassLoader loader = new CustomClassLoader();
        Class<?> c = loader.findClass("classloaders.Employee.class");
        Object ob = c.newInstance();
        Method md = c.getMethod("printEmpName");
        md.invoke(ob);
    }
}
