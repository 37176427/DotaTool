package chess;

import spec.LieRen;
import spec.ShouRen;
import spec.Spec;
import spec.ZhanShi;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:21
 **/
public class JianSheng extends Chess {
    private static JianSheng instance;

    public static JianSheng getInstacne() {
        if (instance == null) {
            instance = new JianSheng();
        }
        return instance;
    }

    private JianSheng() {
        this.setName("JianSheng");
        this.setCost(2);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new ShouRen());
        set.add(new ZhanShi());
        this.setSpec(set);
    }
}
