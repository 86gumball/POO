import com.sun.source.tree.BreakTree;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Parque {
    private List<Lugar> lugares;

    // Construtores
    public Parque() {
        this.lugares = new ArrayList<>();
    }

    public Parque(List<Lugar> lugares) {
        this.lugares = new ArrayList<>();
        for (Lugar lugar : lugares) {
            this.lugares.add(lugar.clone());
        }
    }

    public Parque(Parque outro) {
        this.lugares = new ArrayList<>();
        for (Lugar lugar : outro.lugares)
            this.lugares.add(lugar.clone());
    }

    public void registaLugar(Lugar lugar) {
        this.lugares.add(lugar.clone());
    }

    public List<String> getLugaresOcupadosMatriculas() {
        ArrayList<String> ret = new ArrayList<>();
        for (Lugar lugar : this.lugares)
            ret.add(lugar.getMatricula());
        return ret;
    }

    public void removeLugar(String matricula) {
        this.lugares.removeIf(lugar -> lugar.getMatricula().equals(matricula));
    }

    public void setTempo(String matricula, int tempo) {
        this.lugares.stream().filter(lugar -> lugar.getMatricula().equals(matricula))
                             .forEach(lugar -> lugar.setMinutos(tempo));
    }

    public int getTotalMinutosInternal() {
        return this.lugares.stream()
                           .mapToInt(Lugar::getMinutos)
                           .sum();
    }

    public int getTotalMinutosExternal() {
        int total = 0;
        for (Lugar lugar : this.lugares)
            total += lugar.getMinutos();
        return total;
    }

    public boolean existeLugar(String matricula) {
        return this.lugares.stream()
                           .anyMatch(lugar -> lugar.getMatricula().equals(matricula));
    }

    public List<Lugar> getMatriculasByMinimumTimeInternal(int time) {
        return this.lugares.stream()
                           .filter(Lugar::isPermanente)
                           .filter(lugar -> lugar.getMinutos() > time)
                           .map(Lugar::clone)
                           .collect(Collectors.toCollection(ArrayList::new));
    }

    public List<Lugar> getMatriculasByMinimumTimeExternal(int time) {
        ArrayList<Lugar> ret = new ArrayList<>();
        for (Lugar lugar : this.lugares)
            if (lugar.isPermanente() && lugar.getMinutos() >= time)
                ret.add(lugar.clone());
        return ret;
    }

    public String getInfoLugar(String matricula) {
        StringBuilder info = new StringBuilder();
        for (Lugar lugar : this.lugares)
            if (lugar.getMatricula().equals(matricula))
                info.append(lugar.toString());
        return info.toString();
    }

    // Getters + Setters
    public List<Lugar> getLugares() {
        return this.lugares.stream()
                           .map(Lugar::clone)
                           .collect(Collectors.toCollection(ArrayList::new));
    }

    public void setLugares(List<Lugar> lugares) {
        this.lugares = lugares;
    }

    // Overrides
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public Parque clone() {
        return new Parque(this);
    }

    @Override
    public String toString() {
        StringBuilder ret = new StringBuilder();
        for (Lugar lugar : this.lugares) {
            ret.append(lugar.toString()).append("\n");
        }
        return ret.toString();
    }
}
