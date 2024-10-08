public class Billetautomat {
    private int pris;
    private int saldo;
    private int total;

    public Billetautomat(int billetpris) {
        this.pris = billetpris;
        this.saldo = 0;
        this.total = 0;
    }

    public int getPris() {
        return pris;
    }

    public int getSaldo() {
        return saldo;
    }

    public void indbetal(int kroner) {
        if (kroner > 0) {
            saldo += kroner;
            System.out.println("Du har indbetalt " + kroner + " kr.");
        } else {
            System.out.println("Indsæt et beløb større end 0 kr.");
        }
    }

    public void printBillet() {
        if (saldo >= pris) {
            System.out.println("########################");
            System.out.println(" /\\_/\\");
            System.out.println("( o.o )");
            System.out.println(" > ^ <");
            System.out.println("Billet: " + pris + " kr.");
            System.out.println("########################");
            System.out.println();


            total += pris;
            saldo -= pris;
        } else {
            int manglendeBelob = pris - saldo;
            System.out.println("Du mangler at indbetale " + manglendeBelob + " kr. for at kunne købe en billet.");
        }
    }

    public int getTotal() {
        return total;
    }
}
