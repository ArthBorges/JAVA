package classes;

public class Truck extends Vehicle implements Motorized.Fuel{
	private int numPassanger;
    private float weight;

    public Truck() {}

    public Truck(String cor, String marca, String modelo, int numPassanger, float weight) {
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
        System.out.println("Dirigindo o caminhão " + getMarca() + " " + getModelo() +" "+ getCor() +" peso máximo " + maxWeight());
    }

    @Override
    public void start() {
        System.out.println("Caminhão " + getMarca() + " " + getModelo() + " movimentando");
    }

    @Override
    public void abastecer() {
        System.out.println("Abastecendo o caminhão " + getMarca() + " " + getModelo());
    }
}
