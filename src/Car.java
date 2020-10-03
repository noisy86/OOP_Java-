import  java.util.Random;
public class Car extends Cars {
    public Car() {
        Random rand = new Random();
        int upperbund = 100;
        for (int i = 0; i < 10; i++){
        this.sizetank = rand.nextInt(upperbund);
        int limit = this.sizetank;
        this.tanknow = rand.nextInt(limit+1);
        }
    }
}
