package Courses.Module1.Module5;

import java.util.Date;

/**
 * Created by Жека on 24.10.2016.
 */
public class Room {

    protected long id;
    protected int price;
    protected int persons;
    protected Date dateAvailableFrom;
    protected String hotelName;
    protected String cityName;

    public Room(long id, int price, int persons, Date dateAvailableFrom, String hotelName, String cityName) {
        this.id = id;
        this.price = price;
        this.persons = persons;
        this.dateAvailableFrom = dateAvailableFrom;
        this.hotelName = hotelName;
        this.cityName = cityName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPersons() {
        return persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public Date getDateAvailableFrom() {
        return dateAvailableFrom;
    }

    public void setDateAvailableFrom(Date dateAvailableFrom) {
        this.dateAvailableFrom = dateAvailableFrom;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Room)) return false;

        Room room = (Room) o;

        if (getPrice() != room.getPrice()) return false;
        if (getPersons() != room.getPersons()) return false;
        return getCityName() != null ? getCityName().equals(room.getCityName()) : room.getCityName() == null;

    }

    @Override
    public int hashCode() {
        int result = persons ^ (persons >>> 8);
        result = 31 * result + price;
        result = 31 * result + (cityName != null ? cityName.hashCode() : 0);
        result = 31 * result + (hotelName != null ? hotelName.hashCode() : 0);
        return result;
    }
}
