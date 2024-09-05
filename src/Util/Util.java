package Util;

import java.time.LocalDate;
import java.util.List;

public class Util {

    public static boolean IsDayVerifer(LocalDate startDate,LocalDate endDate,List<LocalDate> rangeDates){
        for (LocalDate date = startDate; !date.isAfter(endDate);date.plusDays(1)){
            if (rangeDates.contains(date)){
                return false;
            }
        }
        return true;
    }

}
