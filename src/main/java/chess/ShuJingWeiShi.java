package chess;

import spec.*;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 17:02
 **/
public class ShuJingWeiShi extends Chess {
    private static ShuJingWeiShi instance;

    public static ShuJingWeiShi getInstacne() {
        if (instance == null) {
            instance = new ShuJingWeiShi();
        }
        return instance;
    }

    private ShuJingWeiShi() {
        this.setName("ShuJingWeiShi");
        this.setCost(2);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new JingLing());
        set.add(new DeLuYi());
        this.setSpec(set);
    }
}
