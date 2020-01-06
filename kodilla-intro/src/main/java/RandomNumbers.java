import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        Random r = new Random();
        int a = r.nextInt(31);
        System.out.println(a);
    }


}