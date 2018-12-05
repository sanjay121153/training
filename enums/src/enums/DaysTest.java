package enums;

public class DaysTest {
    public static void main(String[] as){
       Days[] days= Days.values();
        for (Days d:days) {
            System.out.println(d+" ");
        }

        System.out.println(Days.SATURDAY.ordinal());

        System.out.println(Days.SUNDAY.name());
    }
}
