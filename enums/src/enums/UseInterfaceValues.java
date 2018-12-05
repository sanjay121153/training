package enums;

/**
 * Here the problem with Interface is that, the client could pass any value except it should be
 * integer type.
 * <p>
 * but if we will use enums we can restrict that it should be compared with enums.
 */
public class UseInterfaceValues {
    public void method1(int in) {
        if (in == EnumInterface.SUNDAY) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public void method2(Days d) {
        if (d.name() == Days.SUNDAY.name()) {
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }


    public static void main(String as[]) {
        UseInterfaceValues interfaceValues = new UseInterfaceValues();
        interfaceValues.method1(8);
        interfaceValues.method2(Days.SUNDAY);

    }
}
