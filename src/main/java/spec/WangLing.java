package spec;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 14:26
 **/
public class WangLing extends Spec {
    public WangLing() {
        this.setName("WangLing");
        setProperties();
    }

    void setProperties() {
        this.properties.put(2, "使所有敌军护甲-5");
        this.properties.put(4, "使所有敌军护甲-7");
    }
}
