import java.util.ArrayList;

public class EncEficiente {
    String nome;
    String nif;
    String adress;
    String numero;
    String data;
    ArrayList<LinhaEncomenda> encomendas;

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
    public void setNif(String nif) {
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
     * @return nif as String.
     */
    public String getNif() {
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
}
