package chess;

import spec.*;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 13:55
 **/
public class MeiHuoMoNv extends Chess {
    private static MeiHuoMoNv instance;

    public static MeiHuoMoNv getInstacne() {
        if (instance == null) {
            instance = new MeiHuoMoNv();
        }
        return instance;
    }

    private MeiHuoMoNv() {
        this.setName("MeiHuoMoNv");
        this.setCost(1);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new YeShou());
        set.add(new DeLuYi());
        this.setSpec(set);
    }
}
