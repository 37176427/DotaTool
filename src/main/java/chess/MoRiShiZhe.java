package chess;

import spec.*;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:47
 **/
public class MoRiShiZhe extends Chess {
    private static MoRiShiZhe instance;

    public static MoRiShiZhe getInstacne() {
        if (instance == null) {
            instance = new MoRiShiZhe();
        }
        return instance;
    }

    private MoRiShiZhe() {
        this.setName("MoRiShiZhe");
        this.setCost(4);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new EMo());
        set.add(new ZhanShi());
        this.setSpec(set);
    }
}
