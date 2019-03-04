package spec;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:18
 **/
public class YuanSu extends Spec {
    public YuanSu() {
        this.setName("YuanSu");
        setProperties();
    }

    void setProperties() {
        this.properties.put(2, "2元素：所有元素攻击时有+20%几率石化敌方");
        this.properties.put(4, "4元素：所有元素攻击时有+20%几率石化敌方");
    }
}
