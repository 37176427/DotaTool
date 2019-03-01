package chess;

import spec.*;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:55
 **/
public class SiWangXianZhi extends Chess {
    private static SiWangXianZhi instance;

    public static SiWangXianZhi getInstacne() {
        if (instance == null) {
            instance = new SiWangXianZhi();
        }
        return instance;
    }

    private SiWangXianZhi() {
        this.setName("SiWangXianZhi");
        this.setCost(5);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new WangLing());
        set.add(new ShuShi());
        this.setSpec(set);
    }
}
