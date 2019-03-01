package chess;

import spec.*;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:26
 **/
public class WuYi extends Chess {
    private static WuYi instance;

    public static WuYi getInstacne() {
        if (instance == null) {
            instance = new WuYi();
        }
        return instance;
    }

    private WuYi() {
        this.setName("WuYi");
        this.setCost(2);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new JuMo());
        set.add(new ShuShi());
        this.setSpec(set);
    }
}
