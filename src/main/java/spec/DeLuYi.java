package spec;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 14:18
 **/
public class DeLuYi extends Spec {
    public DeLuYi() {
        this.setName("DeLuYi");
        setProperties();
    }

    void setProperties() {
        this.properties.put(2, "2德鲁伊：场上有两个相同*德鲁伊就可以升级为**德鲁伊");
        this.properties.put(4, "4德鲁伊：场上有两个相同**德鲁伊就可以升级为***德鲁伊");
    }
}
