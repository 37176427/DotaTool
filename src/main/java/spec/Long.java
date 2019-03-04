package spec;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:25
 **/
public class Long extends Spec {
    public Long() {
        this.setName("Long");
        setProperties();
    }

    void setProperties() {
        this.properties.put(3, "3龙：所有友方龙的初始法力值为100");
    }
}
