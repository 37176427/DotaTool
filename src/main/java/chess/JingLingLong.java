package chess;

import spec.*;
import spec.Long;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:25
 **/
public class JingLingLong extends Chess {
    private static JingLingLong instance;

    public static JingLingLong getInstacne() {
        if (instance == null) {
            instance = new JingLingLong();
        }
        return instance;
    }

    private JingLingLong() {
        this.setName("JingLingLong");
        this.setCost(2);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new JingLing());
        set.add(new Long());
        set.add(new FaShi());
        this.setSpec(set);
    }
}
