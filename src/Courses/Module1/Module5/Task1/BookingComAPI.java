package Courses.Module1.Module5.Task1;

import java.util.ArrayList;

/**
 * Created by Жека on 24.10.2016.
 */
public class BookingComAPI implements API {
    private Room[]rooms=new Room[5];
    public BookingComAPI(){
        Room room1 = new Room(12,1200,1,API.getDate(ONE_DAY_SHIFT),"Ukraine","Kyiv");
        Room room2 = new Room(11,1000,1,API.getDate(ONE_DAY_SHIFT),"Lybid","Kyiv");
        Room room3 = new Room(10,2000,1,API.getDate(ONE_DAY_SHIFT),"Merco","Kyiv");
        Room room4= new Room(240,4500,1,API.getDate(ONE_DAY_SHIFT),"lisdo","Kharkiv");
        Room room5 = new Room(345,600,1,API.getDate(ONE_DAY_SHIFT),"Ukraine","Kyiv");
    }


    @Override
    public Room[] findRoom(int price, int persons, String city, String hotel) {
        Room toSearch = new Room(-1, price, persons, null, city, hotel);
        Room[] arrayOfRooms = new Room[1000];
        java.util.List<Room>result=new ArrayList<>();


        if (toSearch.getPrice()==0 && toSearch.getPersons() == 0 && !"null".equals(toSearch.getHotelName()) && !"null".equals(toSearch.getCityName())){
            return rooms;
        }
        for (Room room : rooms) {
            if (room.equals(toSearch) ) {
                result.add(room);
            }
        }
        return result.toArray(new Room[result.size()]);
    }
}
