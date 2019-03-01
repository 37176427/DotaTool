package chess;

import spec.*;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:38
 **/
public class FengXingZhe extends Chess {
    private static FengXingZhe instance;

    public static FengXingZhe getInstacne() {
        if (instance == null) {
            instance = new FengXingZhe();
        }
        return instance;
    }

    private FengXingZhe() {
        this.setName("FengXingZhe");
        this.setCost(3);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new JingLing());
        set.add(new LieRen());
        this.setSpec(set);
    }
}
