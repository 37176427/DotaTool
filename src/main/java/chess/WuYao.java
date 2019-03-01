package chess;

import spec.*;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:53
 **/
public class WuYao extends Chess {
    private static WuYao instance;

    public static WuYao getInstacne() {
        if (instance == null) {
            instance = new WuYao();
        }
        return instance;
    }

    private WuYao() {
        this.setName("WuYao");
        this.setCost(5);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new WangLing());
        set.add(new FaShi());
        this.setSpec(set);
    }
}
