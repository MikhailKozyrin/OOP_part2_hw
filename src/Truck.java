public class Truck extends TypeOfVehicle implements ServiceOfVehiclesToEngine {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп у грузовика");
    }

    @Override
    public void checkEngine() {
        System.out.println("Проверяем двигатель у грузовика");
    }

    @Override
    public void updateTyre() {
        System.out.println("Меняем покрышку у грузовика");
    }

    @Override
    public void service() {
        System.out.println();
        System.out.println("Обслуживаем " + this.getModelName());
        for (int i = 0; i < this.getWheelsCount(); i++) {
            this.updateTyre();
        }
        this.checkEngine();
        this.checkTrailer();
    }
}
