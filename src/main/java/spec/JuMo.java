package spec;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 14:33
 **/
public class JuMo extends Spec {
    public JuMo() {
        this.setName("JuMo");
        setProperties();
    }

    void setProperties() {
        this.properties.put(2, "2巨魔：所有友方巨魔的攻击速度+30");
        this.properties.put(4, "4巨魔：所有友军的攻击速度+30");
    }
}
