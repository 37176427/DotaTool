package chess;

import spec.*;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 14:37
 **/
public class DiFaShi extends Chess {
    private static DiFaShi instance;

    public static DiFaShi getInstacne() {
        if (instance == null) {
            instance = new DiFaShi();
        }
        return instance;
    }

    private DiFaShi() {
        this.setName("DiFaShi");
        this.setCost(1);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new JingLing());
        set.add(new EMoLieShou());
        this.setSpec(set);
    }
}
