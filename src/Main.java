import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Car Class Demo");

        Car c1=new Car(100,20,280);
        Car c2=new Car(200,30,300);
        Car c3=new Car(300,40,320);
        Car c4=new Car(400,50,340);

        List<Car> carList=new ArrayList<>(Arrays.asList(c1,c2,c3,c4));
        carList.sort(new CarPriceComparator());
        System.out.println(carList);


    }
}