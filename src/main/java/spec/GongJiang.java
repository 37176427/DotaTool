package spec;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 14:30
 **/
public class GongJiang extends Spec{
    public GongJiang() {
        this.setName("GongJiang");
        setProperties();
    }

    void setProperties() {
        this.properties.put(2, "2工匠：所有友方工匠的生命恢复速度+15");
        this.properties.put(4, "4工匠：所有友方工匠的生命恢复速度+25");
    }
}
