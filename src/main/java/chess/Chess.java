package chess;

import spec.Spec;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 11:10
 **/
public class Chess {
    private String name = "";
    private int cost = 0;
    private HashSet<Spec> spec;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public HashSet<Spec> getSpec() {
        return spec;
    }

    public void setSpec(HashSet<Spec> spec) {
        this.spec = spec;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Chess chess = (Chess) o;

        return name.equals(chess.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "Chess{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", spec=" + spec +
                '}';
    }
}
