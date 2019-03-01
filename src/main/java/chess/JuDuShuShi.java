package chess;

import spec.*;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:36
 **/
public class JuDuShuShi extends Chess {
    private static JuDuShuShi instance;

    public static JuDuShuShi getInstacne() {
        if (instance == null) {
            instance = new JuDuShuShi();
        }
        return instance;
    }

    private JuDuShuShi() {
        this.setName("JuDuShuShi");
        this.setCost(3);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new YeShou());
        set.add(new ShuShi());
        this.setSpec(set);
    }
}
