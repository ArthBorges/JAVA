package classes;

public class ElectricBike extends Bike implements Motorized.Electric{
	public ElectricBike() {}

    public ElectricBike(String cor, String marca, String modelo, int numPassanger, float weight) {
        super(cor, marca, modelo, numPassanger, weight);
    }

    @Override
    public void start() {
        System.out.println("Bicicleta elétrica " + getMarca() + " " + getModelo() + " movimentando");
    }

    @Override
    public void carregarBateria() {
        System.out.println("Carregando a bateria da bicicleta " + getCor());
    }
}
