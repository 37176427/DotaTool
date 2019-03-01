package spec;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:28
 **/
public class NaJia extends Spec {
    public NaJia() {
        this.setName("NaJia");
        setProperties();
    }

    void setProperties() {
        this.properties.put(2, "使所有友方的魔法抗性+20");
        this.properties.put(4, "使所有友方的魔法抗性+40");
    }
}
