package chess;

import spec.*;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 14:35
 **/
public class BianFuQiShi extends Chess {
    private static BianFuQiShi instance;

    public static BianFuQiShi getInstacne() {
        if (instance == null) {
            instance = new BianFuQiShi();
        }
        return instance;
    }

    private BianFuQiShi() {
        this.setName("BianFuQiShi");
        this.setCost(1);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new JuMo());
        set.add(new QiShi());
        this.setSpec(set);
    }
}
