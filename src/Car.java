public class Car {

    private int price;

    private int engineSize;


    public Car(int price,int engineSize) {
        this.price=price;
        this.engineSize = engineSize;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }
}
