package spec;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 14:29
 **/
public class DiJing extends Spec {
    public DiJing() {
        this.setName("DiJing");
        setProperties();
    }

    void setProperties() {
        this.properties.put(3, "3地精：使一个随机友军的护甲+15，生命恢复+10");
        this.properties.put(6, "6地精：使所有友方地精的护甲+15，生命恢复+10");
    }
}
