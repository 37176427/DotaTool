package spec;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:26
 **/
public class ShuShi extends Spec {
    public ShuShi() {
        this.setName("ShuShi");
        setProperties();
    }

    void setProperties() {
        this.properties.put(3, "使所有友军术士的攻击附带20%吸血");
        this.properties.put(6, "使所有友军的攻击附带30%吸血");
    }
}
