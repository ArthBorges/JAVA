package classes;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        String cor, marca, modelo;
        int numPassanger;
        float maxWeight;

        // Para Bike
        cor = scanner.next();
        marca = scanner.next();
        modelo = scanner.next();
        numPassanger = scanner.nextInt();
        maxWeight = scanner.nextFloat();
        Bike bike1 = new Bike(cor, marca, modelo, numPassanger, maxWeight);

        // Para ElectricBike
        cor = scanner.next();
        marca = scanner.next();
        modelo = scanner.next();
        numPassanger = scanner.nextInt();
        maxWeight = scanner.nextFloat();
        ElectricBike eleBike1 = new ElectricBike(cor, marca, modelo, numPassanger, maxWeight);

        // Para ElectricCar
        cor = scanner.next();
        marca = scanner.next();
        modelo = scanner.next();
        numPassanger = scanner.nextInt();
        maxWeight = scanner.nextFloat();
        ElectricCar eleCar1 = new ElectricCar(cor, marca, modelo, numPassanger, maxWeight);

        // Para Truck
        cor = scanner.next();
        marca = scanner.next();
        modelo = scanner.next();
        numPassanger = scanner.nextInt();
        maxWeight = scanner.nextFloat();
        Truck truck1 = new Truck(cor, marca, modelo, numPassanger, maxWeight);

        // Executar os métodos
        bike1.drive();
        eleBike1.start();
        eleBike1.carregarBateria();
        eleCar1.start();
        eleCar1.carregarBateria();
        truck1.abastecer();
        truck1.drive();
        
        scanner.close();

	}

}
