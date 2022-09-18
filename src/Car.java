public class Car extends TypeOfVehicle implements ServiceOfVehiclesToEngine {
    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у автомобиля");
    }

    @Override
    public void service() {
        System.out.println();
        System.out.println("Обслуживаем " + this.getModelName());
        for (int i = 0; i < this.getWheelsCount(); i++) {
            this.updateTyre();
        }
        this.checkEngine();
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель у автомобиля");
    }
}
