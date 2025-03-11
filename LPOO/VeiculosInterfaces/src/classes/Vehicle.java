package classes;

public abstract class Vehicle implements Passengers, Load{
	private String cor, marca, modelo;

    public Vehicle() {
    	
    }

    public Vehicle(String cor, String marca, String modelo) {
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    abstract void drive();

	public void start() {
		
	}
}