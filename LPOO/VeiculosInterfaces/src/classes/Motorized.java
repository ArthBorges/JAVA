package classes;

public interface Motorized {
	void start();

    interface Electric {
        void carregarBateria();
    }

    interface Fuel {
        void abastecer();
    }
}
