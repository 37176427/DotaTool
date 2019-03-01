package chess;

import spec.LieRen;
import spec.ShuShi;
import spec.Spec;
import spec.YeShou;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:40
 **/
public class JuJiShou extends Chess {
    private static JuJiShou instance;

    public static JuJiShou getInstacne() {
        if (instance == null) {
            instance = new JuJiShou();
        }
        return instance;
    }

    private JuJiShou() {
        this.setName("JuJiShou");
        this.setCost(3);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new YeShou());
        set.add(new LieRen());
        this.setSpec(set);
    }
}
