import java.util.*;

enum Day{

    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY

}

public class Program132_EnumSet{

    public static void main(String[] args){

        EnumSet<Day> days =
                EnumSet.of(

                        Day.MONDAY,

                        Day.WEDNESDAY,

                        Day.FRIDAY);

        System.out.println(days);

    }

}