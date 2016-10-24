package Courses.Module1.Module5.Task1;

import Courses.Module1.module3.question1.question1.Solution;

/**
 * Created by Жека on 24.10.2016.
 */
public class DAOImpl implements DAO{

    @Override
    public Room save(Room room) {
        Room sr=new Room(room.getId(),room.getPrice(), room.getPersons(), room.getDateAvailableFrom(),
                room.getHotelName(), room.getCityName());

        System.out.println("Room save"+sr);
        return sr;
    }

    @Override
    public boolean delete(Room room) {
        Room sr=new Room(room.getId(),room.getPrice(), room.getPersons(), room.getDateAvailableFrom(),
                room.getHotelName(), room.getCityName());
        System.out.println("Room save"+sr);
        return false;
    }

    @Override
    public Room update(Room room) {
        Room sr=new Room(room.getId(),room.getPrice(), room.getPersons(), room.getDateAvailableFrom(),
                room.getHotelName(), room.getCityName());
        System.out.println("updating room"+sr);
        return null;
    }

    @Override
    public Room findById(long id) {

        System.out.println("Finding by id.." + id);
        return null;
    }
}
