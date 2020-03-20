import java.util.ArrayList;
import java.util.Iterator;

public class Ficha4_1 {
    public static void main (String[] args) {
        // "ref", "desc", prec, imposto, desconto
        LinhaEncomenda enc1 = new LinhaEncomenda("17", "0", 4, 3, 23, 22);
        LinhaEncomenda enc2 = new LinhaEncomenda("8", "0", 7, 3, 31, 15);
        LinhaEncomenda enc3 = new LinhaEncomenda("46", "0", 14, 3, 36, 16);
        LinhaEncomenda enc4 = new LinhaEncomenda("5", "0", 1, 3, 23, 24);

        ArrayList<LinhaEncomenda> test = new ArrayList<>();

        test.add(enc1);
        test.add(enc2);
        test.add(enc3);
        test.add(enc4);

        EncEficiente shipment = new EncEficiente("joao", 19, "n/a", "b21", "hoje", test);

        double empty = shipment.calculaValorTotal();
    }
}
