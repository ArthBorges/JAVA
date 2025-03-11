package classes;

public class ElectricCar extends Car implements Motorized.Electric{
	public ElectricCar() {}

    public ElectricCar(String cor, String marca, String modelo, int numPassanger, float weight) {
        super(cor, marca, modelo, numPassanger, weight);
    }

    @Override
    public void start() {
        System.out.println("Carro elétrico " + getMarca() + " " + getModelo() + " movimentando");
    }

    @Override
    public void carregarBateria() {
        System.out.println("Carregando a bateria do carro " + getCor());
    }
}
