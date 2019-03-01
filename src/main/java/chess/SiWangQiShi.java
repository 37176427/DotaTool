package chess;

import spec.*;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:39
 **/
public class SiWangQiShi extends Chess {
    private static SiWangQiShi instance;

    public static SiWangQiShi getInstacne() {
        if (instance == null) {
            instance = new SiWangQiShi();
        }
        return instance;
    }

    private SiWangQiShi() {
        this.setName("SiWangQiShi");
        this.setCost(3);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new WangLing());
        set.add(new QiShi());
        this.setSpec(set);
    }
}
