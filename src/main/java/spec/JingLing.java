package spec;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 14:37
 **/
public class JingLing extends Spec {
    public JingLing() {
        this.setName("JingLing");
        setProperties();
    }

    void setProperties() {
        this.properties.put(2, "所有右方精灵有+20%几率闪避敌人的攻击");
        this.properties.put(4, "所有右方精灵有+20%几率闪避敌人的攻击");
        this.properties.put(6, "所有右方精灵有+20%几率闪避敌人的攻击");
    }
}
