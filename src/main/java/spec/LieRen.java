package spec;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 14:27
 **/
public class LieRen extends Spec {
    public LieRen() {
        this.setName("LieRen");
        setProperties();
    }

    void setProperties() {
        this.properties.put(3, "3猎人：所有友方猎人的攻击力+25%");
        this.properties.put(6, "6猎人：所有友方猎人的攻击力+35%");
    }
}
