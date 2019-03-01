package chess;

import spec.*;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:34
 **/
public class BianTiJingLing extends Chess {
    private static BianTiJingLing instance;

    public static BianTiJingLing getInstacne() {
        if (instance == null) {
            instance = new BianTiJingLing();
        }
        return instance;
    }

    private BianTiJingLing() {
        this.setName("BianTiJingLing");
        this.setCost(2);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new YuanSu());
        set.add(new CiKe());
        this.setSpec(set);
    }
}
