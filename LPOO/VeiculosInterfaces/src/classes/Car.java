package classes;

public class Car extends Vehicle{
	private int numPassanger;
    private float weight;

    public Car() {}

    public Car(String cor, String marca, String modelo, int numPassanger, float weight) {
        super(cor, marca, modelo);
        this.numPassanger = numPassanger;
        this.weight = weight;
    }

    @Override
    public float maxWeight() {
        return weight;
    }

    @Override
    public int numberOfPassenger() {
        return numPassanger;
    }

    @Override
    void drive() {
        System.out.println("Dirigindo o carro " + getMarca() + " " + getModelo() + " que tem peso máximo " + maxWeight() + " e número de Passageiro " + numberOfPassenger());
    }
}
