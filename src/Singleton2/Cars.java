package Singleton2;


public class Cars {
    private static Cars instance;
    private String name;
    private double price;
    private Cars(){}
    public static Cars getInstance(){
        if(instance == null){
            instance = new Cars();
        }
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}