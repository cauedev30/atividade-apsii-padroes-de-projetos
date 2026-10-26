class Motor {
    void ligar() {
        System.out.println("Motor ligado");
    }
}

class Carro {
    private Motor motor = new Motor();

    void andar() {
        motor.ligar();
        System.out.println("Carro andando");
    }
}

class Motorista {
    private Carro carro;

    Motorista(Carro carro) {
        this.carro = carro;
    }

    void dirigir() {
        carro.andar();
    }
}

public class AgregacaoAssociacao {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Motorista motorista = new Motorista(carro);
        motorista.dirigir();
    }
}
