package chess;

import spec.*;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 14:22
 **/
public class ShiRenMoMoFaShi extends Chess {
    private static ShiRenMoMoFaShi instance;

    public static ShiRenMoMoFaShi getInstacne() {
        if (instance == null) {
            instance = new ShiRenMoMoFaShi();
        }
        return instance;
    }

    private ShiRenMoMoFaShi() {
        this.setName("ShiRenMoMoFaShi");
        this.setCost(1);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new ShiRenMo());
        set.add(new FaShi());
        this.setSpec(set);
    }
}
