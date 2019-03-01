package spec;

import java.util.HashMap;
import java.util.TreeMap;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 11:23
 **/
public abstract class Spec {
    private String name;
    protected TreeMap<Integer,String> properties = new TreeMap<Integer, String>();
    abstract void setProperties();
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Spec spec = (Spec) o;
        return name.equals(spec.name);
    }

    public TreeMap<Integer, String> getProperties() {
        return properties;
    }

    public void setProperties(TreeMap<Integer, String> properties) {
        this.properties = properties;
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }

    @Override
    public String toString() {
        return "Spec{" +
                "name='" + name + '\'' +
                '}';
    }
}
