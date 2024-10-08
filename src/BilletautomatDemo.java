public class BilletautomatDemo {
    public static void main(String[] args) {
        Billetautomat automat = new Billetautomat(50);

        automat.printBillet();

        automat.indbetal(30);
        automat.printBillet();

        automat.indbetal(20);
        automat.printBillet();

        automat.indbetal(100);
        automat.printBillet();

        System.out.println("Saldo: " + automat.getSaldo() + " kr.");
        System.out.println("Total indtægter: " + automat.getTotal() + " kr.");
    }
}