package chess;

import spec.*;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:48
 **/
public class SiLingFaShi extends Chess {
    private static SiLingFaShi instance;

    public static SiLingFaShi getInstacne() {
        if (instance == null) {
            instance = new SiLingFaShi();
        }
        return instance;
    }

    private SiLingFaShi() {
        this.setName("SiLingFaShi");
        this.setCost(4);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new WangLing());
        set.add(new ShuShi());
        this.setSpec(set);
    }
}
