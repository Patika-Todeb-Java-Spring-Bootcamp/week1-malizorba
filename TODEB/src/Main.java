import java.awt.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        ImmutableCar c1 = new ImmutableCar(1533,5,1255, Color.BLUE, model.AUDI,getDateofproduction("2018"));
        c1.getDateofproduction().setTime(8988878787L);
        System.out.println("Date of production :"+c1.getDateofproduction());
        System.out.println("Passenger capacity :"+c1.getCapacity());
        System.out.println("Model :"+c1.getModel());
        System.out.println("year :"+c1.getYear());
        System.out.println("Colour :"+c1.getColor());
        System.out.println("Km :"+c1.getKm());


    }

    private static Date getDateofproduction(String dateofproduction){
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy");
        try {
            return dateFormat.parse(dateofproduction);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }
}
