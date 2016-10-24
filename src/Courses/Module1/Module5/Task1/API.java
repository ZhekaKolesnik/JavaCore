package Courses.Module1.Module5.Task1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by Жека on 24.10.2016.
 */
public interface API {
  Room[]findRoom(int price ,int persons,String city,String hotel);
    int ONE_DAY_SHIFT = 1;
    static Date getDate(int amount){
        Calendar call= new GregorianCalendar();
        call.add(ONE_DAY_SHIFT,amount);
        return call.getTime();
    }
}
