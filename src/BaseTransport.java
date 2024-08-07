public abstract class BaseTransport {
    private final String modelName;
    private final int wheelsCount;

    public BaseTransport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public abstract void updateTyre();

    public String getModelName() {
        return modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }
}
