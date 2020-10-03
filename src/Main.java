import java.util.ArrayList;
import java.util.List;
import java.util.Random;
public class Main {

    public static String typeOfPatrol(){
        String type = "";
        Random rand = new Random();
        int typeOfTank = rand.nextInt(100);


        if(typeOfTank<40){
            type = "93";
        }
        else if (typeOfTank>=40 && typeOfTank<80){
            type = "95";
        }
        else if (typeOfTank>= 80 && typeOfTank < 100) {
            type = "diesel";
        }
        return type;
    }
    public static void main(String[] args) {
        List<Cars> carList = new ArrayList<>();
        for (int i = 0; i < 10; i++){
            Car car = new Car();
            carList.add(car);
        }

        for(int i = 0; i < carList.size(); i++) {
            System.out.println(carList.get(i).sizetank() + " " +carList.get(i).tanknow + " You need: " + (carList.get(i).sizetank-carList.get(i).tanknow) + " " + typeOfPatrol() );

        }


    }



    }

