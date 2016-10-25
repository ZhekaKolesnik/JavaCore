package Courses.Module1.Module5.Task1;

/**
 * Created by Жека on 24.10.2016.
 */

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private API[] apis = new API[3];
    private List < Room > result = new ArrayList<>();
    public Controller() {
        BookingComAPI bookingComAPI = new BookingComAPI();
        apis[0] = bookingComAPI;
        GoogleAPI googleAPI = new GoogleAPI();
        apis[1] = googleAPI;
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();
        apis[2] = tripAdvisorAPI;

    }

    @Override
    public String toString() {
        return "Controller{"+
                "result=" + result +
                '}';
    }

    Room[] requestRooms(int price, int persons, String city, String hotel) {

        BookingComAPI bookingComAPI = new BookingComAPI();
        GoogleAPI googleAPI = new GoogleAPI();
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();

        Room[] resBookingCom = bookingComAPI.findRooms(price, persons, city, hotel);
        Room[] resGoogle = googleAPI.findRooms(price, persons, city, hotel);
        Room[] resTripAdvisor = tripAdvisorAPI.findRooms(price, persons, city, hotel);



        for (Room count : resBookingCom) {
            result.add(count);
            save(count);
        }

        for (Room count : resGoogle) {
            result.add(count);
            save(count);
        }

        for (Room count : resTripAdvisor) {
            result.add(count);
            save(count);
        }

        return result.toArray(new Room[result.size()]);
    }

    Room save(Room room) {
        DAOHardImpl daoHard = new DAOHardImpl();
        return daoHard.save(room);
    }

    Room[] check(API api1, API api2) {
        Room[] res1 = api1.findRooms(500,2, "Hayat", "Kyiv");
        Room[] res2 = api2.findRooms(500,2, "Hayat", "Kyiv");
        Room[] resultApi1 = new Room[res1.length];
        Room[] resultApi2 = new Room[res2.length];

        for (int i = 0; i < res1.length; i++){
            resultApi1[i] = res1[i];
        }

        for (int j = 0; j < res2.length; j++){
            if (resultApi1[j].equals(res2[j])){
                resultApi2[j] = res2[j];
            }
        }
        return resultApi2;

    }

}