package spec;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 13:56
 **/
public class YeShou extends Spec {
    public YeShou() {
        this.setName("YeShou");
        setProperties();
    }

    void setProperties() {
        this.properties.put(2, "2野兽：所有友军攻击力+10%,可以被召唤物继承");
        this.properties.put(4, "4野兽：所有友军攻击力+15%,可以被召唤物继承");
        this.properties.put(6, "6野兽：所有友军攻击力+20%,可以被召唤物继承");
    }
}
