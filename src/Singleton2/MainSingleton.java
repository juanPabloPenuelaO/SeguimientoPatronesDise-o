package Singleton2;

public class MainSingleton {
    public static void main(String[] args) {
        Cars cars = Cars.getInstance();

        cars.setName("Nissan gtr");
        cars.setPrice(700000000);

        System.out.println(cars.getName());
        System.out.println(cars.getPrice());
    }
}
