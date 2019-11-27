package str94;

public class Car implements Vehicle{
    private String model;


    public Car(String model) {
        this.model = model;
    }

    @Override
    public String getModel() {
        return model;
    }
}
