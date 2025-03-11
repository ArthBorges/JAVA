package classes;

public class Bike extends Vehicle{
	private int numPassanger;
    private float weight;

    public Bike() {}

    public Bike(String cor, String marca, String modelo, int numPassanger, float weight) {
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
        System.out.println("Guiando a bicicleta " + getMarca() + " " + getModelo() + " " + getCor() + " peso máximo " + maxWeight());
    }
}
