package Courses.Module1.Module5.Task1;

import java.text.SimpleDateFormat;
import java.util.Date;

import java.text.SimpleDateFormat;
/**
 * Created by Жека on 24.10.2016.
 */
import java.util.Date;

public class Room {
    private long id;
    private int price;
    private int persons;
    private Date dateAvailableFrom;
    private String hotelName;
    private String cityName;

    public Room(long id, int price, int persons, Date dateAvailableFrom, String hotelName, String cityName) {
        this.id = id;
        this.price = price;
        this.persons = persons;
        this.dateAvailableFrom = dateAvailableFrom;
        this.hotelName = hotelName;
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", price=" + price +
                ", persons=" + persons +
                ", dateAvailableFrom=" + dateAvailableFrom +
                ", hotelName='" + hotelName + '\'' +
                ", cityName='" + cityName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || getClass() != object.getClass()) {
            return false;
        }

        Room room = (Room) object;

        if (persons != room.persons) {
            return false;
        }
        if (price != room.price) {
            return false;
        }

        return cityName.equals(room.cityName) && this.hotelName.equals(room.hotelName);

        //null.methods - as a result nullPointerException
    }

    @Override
    public int hashCode() {
        int result = persons ^ (persons >>> 8);
        result = 31 * result + price;
        result = 31 * result + (cityName != null ? cityName.hashCode() : 0);
        result = 31 * result + (hotelName != null ? hotelName.hashCode() : 0);
        return result;
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

    public long getId() {
        return id;
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
}