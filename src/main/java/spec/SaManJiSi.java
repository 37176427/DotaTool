package spec;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 14:34
 **/
public class SaManJiSi extends Spec {
    public SaManJiSi() {
        this.setName("SaManJiSi");
        setProperties();
    }

    void setProperties() {
        this.properties.put(2, "战斗开始时将一个随机敌方棋子变成青蛙，持续6秒");
    }
}
