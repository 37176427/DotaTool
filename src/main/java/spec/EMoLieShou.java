package spec;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 14:39
 **/
public class EMoLieShou extends Spec {
    public EMoLieShou() {
        this.setName("EMoLieShou");
        setProperties();
    }

    void setProperties() {
        this.properties.put(1, "1恶魔猎手：此棋子视为敌方的一个恶魔");
        this.properties.put(2, "2恶魔猎手：所有友方恶魔视为同一种恶魔");
    }
}
