abstract class Ordenador {
    void ordenar(int a, int b) {
        System.out.println(vemAntes(b, a) ? b + " " + a : a + " " + b);
    }

    abstract boolean vemAntes(int a, int b);
}

class Crescente extends Ordenador {
    boolean vemAntes(int a, int b) {
        return a < b;
    }
}

interface Comparador {
    boolean vemAntes(int a, int b);
}

class Decrescente implements Comparador {
    public boolean vemAntes(int a, int b) {
        return a > b;
    }
}

public class Ordenacao {
    static void ordenar(int a, int b, Comparador c) {
        System.out.println(c.vemAntes(b, a) ? b + " " + a : a + " " + b);
    }

    static <T extends Comparable<T>> void ordenar(T a, T b) {
        System.out.println(b.compareTo(a) < 0 ? b + " " + a : a + " " + b);
    }

    public static void main(String[] args) {
        new Crescente().ordenar(8, 3);
        ordenar(3, 8, new Decrescente());
        ordenar("Bruno", "Ana");
    }
}
