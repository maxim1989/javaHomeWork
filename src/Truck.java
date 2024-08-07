public class Truck extends BaseTransport implements Engine {
    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
