public class Bicycle extends TypeOfVehicle {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у мотоцикла");
    }

    @Override
    public void service() {
        System.out.println();
        System.out.println("Обслуживаем " + this.getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            this.updateTyre();
        }
    }
}
