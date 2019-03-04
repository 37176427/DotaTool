package spec;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 14:35
 **/
public class QiShi extends Spec {
    public QiShi() {
        this.setName("QiShi");
        setProperties();
    }

    void setProperties() {
        this.properties.put(2, "2骑士：所有友方骑士有+25%时间被减伤护盾庇护");
        this.properties.put(4, "4骑士：所有友方骑士有+35%时间被减伤护盾庇护");
        this.properties.put(6, "6骑士：所有友方骑士有+45%时间被减伤护盾庇护");
    }
}
