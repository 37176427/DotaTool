package spec;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:19
 **/
public class RenLei extends Spec {
    public RenLei() {
        this.setName("RenLei");
        setProperties();
    }

    void setProperties() {
        this.properties.put(2, "所有友方人类攻击敌人时有20%几率缴械敌人3秒");
        this.properties.put(4, "所有友方人类攻击敌人时有25%几率缴械敌人3秒");
        this.properties.put(6, "所有友方人类攻击敌人时有30%几率缴械敌人3秒");
    }
}
