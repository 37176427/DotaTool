package spec;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:45
 **/
public class SaTe extends Spec {
    public SaTe() {
        this.setName("SaTe");
        setProperties();
    }

    void setProperties() {
        this.properties.put(1, "萨特：当本棋子在等待区时 所有等待区棋子隐身");
    }
}
