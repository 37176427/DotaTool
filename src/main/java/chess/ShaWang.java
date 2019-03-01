package chess;

import spec.CiKe;
import spec.ShuShi;
import spec.Spec;
import spec.YeShou;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:39
 **/
public class ShaWang extends Chess {
    private static ShaWang instance;

    public static ShaWang getInstacne() {
        if (instance == null) {
            instance = new ShaWang();
        }
        return instance;
    }

    private ShaWang() {
        this.setName("ShaWang");
        this.setCost(3);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new YeShou());
        set.add(new CiKe());
        this.setSpec(set);
    }
}
