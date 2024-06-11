package JavaBasic;

public class EnumPractice {
    public static void testEnum(){
        System.out.println("Enum test -------------------------------------------------------------");
        WeekDay today  = WeekDay.SUNDAY;
        System.out.println(today.name());
        System.out.println(today.toString());
        System.out.println(today);
        System.out.println(today.getShortName());
        Option day = WeekDay.MONDAY;
        System.out.println(day.getActive());
        System.out.println(day.getValue());
        System.out.println("-----------------------------------------------------------------------");
    }
}
