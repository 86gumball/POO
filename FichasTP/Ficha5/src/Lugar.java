public class Lugar {
    private String  matricula;
    private String  nome;
    private int     minutos;
    private boolean permanente;

    public Lugar(String matricula, String nome, int minutos, boolean permanente) {
        this.matricula = matricula;
        this.nome = nome;
        this.minutos = minutos;
        this.permanente = permanente;
    }

    public Lugar(Lugar lugar) {
        this.matricula = lugar.matricula;
        this.nome = lugar.nome;
        this.minutos = lugar.minutos;
        this.permanente = lugar.permanente;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public boolean isPermanente() {
        return permanente;
    }

    public void setPermanente(boolean permanente) {
        this.permanente = permanente;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public Lugar clone() {
        return new Lugar(this);
    }

    @Override
    public String toString() {
        return "Matricula : " + this.matricula + ", nome: " + this.nome + ", minutos: " + this.minutos + ", permanente: " + this.permanente;
    }
}
