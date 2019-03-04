package spec;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 14:22
 **/
public class FaShi extends Spec {
    public FaShi() {
        this.setName("FaShi");
        setProperties();
    }

    void setProperties() {
        this.properties.put(3, "3法师：使所有敌军魔法抗性-40");
        this.properties.put(6, "6法师：使所有敌军魔法抗性-40");
    }
}
