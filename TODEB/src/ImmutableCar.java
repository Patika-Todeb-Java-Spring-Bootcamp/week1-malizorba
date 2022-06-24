import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

enum model{
    FORD,TOYOTA,AUDI,BMW;
}

public final class ImmutableCar {
    private final int year;
    private final Date dateofproduction;
    private final int capacity;
    private final int km;
    private final Color color;
    private final model model;




    public  ImmutableCar(int year, int capacity, int km, Color color, model model, Date dateofproduction) {
        this.year = year;
        this.dateofproduction = dateofproduction;
        this.capacity = capacity;
        this.km = km;
        this.color = color;
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public Date getDateofproduction() {
        return new Date(dateofproduction.getTime());
    }

    public int getCapacity() {
        return capacity;
    }

    public int getKm() {
        return km;
    }

    public Color getColor() {

        return color;
    }

    public final model getModel() {
        return model;
    }





}



