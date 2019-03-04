package spec;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 14:31
 **/
public class CiKe extends Spec{
    public CiKe() {
        this.setName("CiKe");
        setProperties();
    }

    void setProperties() {
        this.properties.put(3, "3刺客：所有友方刺客的攻击有10%概率造成4倍伤害");
        this.properties.put(6, "6刺客：所有友方刺客的攻击有20%概率造成4倍伤害");
        this.properties.put(9, "9刺客：所有友方刺客的攻击有30%概率造成4倍伤害");
    }
}
