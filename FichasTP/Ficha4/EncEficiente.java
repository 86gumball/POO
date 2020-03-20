import java.util.ArrayList;
import java.util.Iterator;

public class EncEficiente {
    String nome;
    int nif;
    String adress;
    String numero;
    String data;
    int exemplo;
    ArrayList<LinhaEncomenda> encomendas;

    public EncEficiente() {
        this.nome = "Joao";
        this.nif = 284201213;
        this.adress = "Rua da Liberdade";
        this.numero = "A42932";
        this.data = "10/10/1995";
        this.encomendas = new ArrayList<LinhaEncomenda>();
    }

    public EncEficiente(String nome,
                        int nif,
                        String adress,
                        String numero,
                        String data) {
        this.nome = nome;
        this.nif = nif;
        this.adress = adress;
        this.numero = numero;
        this.data = data;
        this.encomendas = new ArrayList<LinhaEncomenda>();
    }

    public EncEficiente(String nome,
                        int nif,
                        String adress,
                        String numero,
                        String data,
                        ArrayList<LinhaEncomenda> encomendas) {
        this.nome = nome;
        this.nif = nif;
        this.adress = adress;
        this.numero = numero;
        this.data = data;
        this.encomendas = encomendas;
    }

    /**
     * Set nome.
     *
     * @param nome the value to set.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Set nif.
     *
     * @param nif the value to set.
     */
    public void setNif(int nif) {
        this.nif = nif;
    }

    /**
     * Set adress.
     *
     * @param adress the value to set.
     */
    public void setAdress(String adress) {
        this.adress = adress;
    }

    /**
     * Set numero.
     *
     * @param numero the value to set.
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * Set data.
     *
     * @param data the value to set.
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * Set encomendas.
     *
     * @param encomendas the value to set.
     */
    public void setEncomendas(ArrayList<LinhaEncomenda> encomendas) {
        this.encomendas = encomendas;
    }

    /**
     * Get nome.
     *
     * @return nome as String.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Get nif.
     *
     * @return nif as int.
     */
    public int getNif() {
        return nif;
    }

    /**
     * Get adress.
     *
     * @return adress as String.
     */
    public String getAdress() {
        return adress;
    }

    /**
     * Get numero.
     *
     * @return numero as String.
     */
    public String getNumero() {
        return numero;
    }

    /**
     * Get data.
     *
     * @return data as String.
     */
    public String getData() {
        return data;
    }

    /**
     * Get encomendas.
     *
     * @return encomendas as ArrayList<LinhaEncomenda>.
     */
    public ArrayList<LinhaEncomenda> getEncomendas() {
        return encomendas;
    }

    public void addLinhaEncomenda(LinhaEncomenda enc) {
        this.encomendas.add(enc);
    }

    public double calculaValorTotal(){
        double precoTotal = 0;
        Iterator ite = this.encomendas.iterator();
        LinhaEncomenda tmp; 
        while (ite.hasNext()) {
            // tmp = new LinhaEncomenda(ite.next());
            System.out.printf("%s\n", ite.next().getClass().toString());
            // precoTotal += ite.next().calculaValorLinhaEnc();
        }
        return precoTotal;
    }
}
