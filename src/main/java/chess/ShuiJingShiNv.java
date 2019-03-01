package chess;

import spec.*;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:19
 **/
public class ShuiJingShiNv extends Chess {
    private static ShuiJingShiNv instance;

    public static ShuiJingShiNv getInstacne() {
        if (instance == null) {
            instance = new ShuiJingShiNv();
        }
        return instance;
    }

    private ShuiJingShiNv() {
        this.setName("ShuiJingShiNv");
        this.setCost(2);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new RenLei());
        set.add(new FaShi());
        this.setSpec(set);
    }
}
