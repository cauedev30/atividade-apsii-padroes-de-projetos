interface Notificacao {
    void enviar(String msg);
}

class Email implements Notificacao {
    public void enviar(String msg) {
        System.out.println("E-mail: " + msg);
    }
}

class Sms implements Notificacao {
    public void enviar(String msg) {
        System.out.println("SMS: " + msg);
    }
}

class Fabrica {
    static Notificacao criar(String tipo) {
        if (tipo.equals("sms")) {
            return new Sms();
        }
        return new Email();
    }
}

public class ProjetandoMudancas {
    public static void main(String[] args) {
        Fabrica.criar("email").enviar("Pedido aprovado");
        Fabrica.criar("sms").enviar("Pedido enviado");
    }
}
