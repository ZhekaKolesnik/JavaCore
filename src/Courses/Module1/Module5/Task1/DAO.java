package Courses.Module1.Module5.Task1;

/**
 * Created by Жека on 24.10.2016.
 */
public interface DAO {
    Room save(Room room);

    boolean delete(Room room);

    Room update(Room room);

    Room findById(long id);


}
