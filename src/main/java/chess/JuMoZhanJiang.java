package chess;

import spec.EMo;
import spec.JuMo;
import spec.Spec;
import spec.ZhanShi;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:48
 **/
public class JuMoZhanJiang extends Chess {
    private static JuMoZhanJiang instance;

    public static JuMoZhanJiang getInstacne() {
        if (instance == null) {
            instance = new JuMoZhanJiang();
        }
        return instance;
    }

    private JuMoZhanJiang() {
        this.setName("JuMoZhanJiang");
        this.setCost(4);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new JuMo());
        set.add(new ZhanShi());
        this.setSpec(set);
    }
}
