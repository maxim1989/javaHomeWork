public interface Engine {
    public default void checkEngine() {
        System.out.println("Проверяем двигатель");
    };
}
