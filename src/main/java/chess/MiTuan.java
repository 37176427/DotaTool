package chess;

import spec.*;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:53
 **/
public class MiTuan extends Chess {
    private static MiTuan instance;

    public static MiTuan getInstacne() {
        if (instance == null) {
            instance = new MiTuan();
        }
        return instance;
    }

    private MiTuan() {
        this.setName("MiTuan");
        this.setCost(5);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new YuanSu());
        set.add(new ShuShi());
        this.setSpec(set);
    }
}
