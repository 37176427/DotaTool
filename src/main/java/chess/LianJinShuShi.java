package chess;

import spec.*;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:50
 **/
public class LianJinShuShi extends Chess {
    private static LianJinShuShi instance;

    public static LianJinShuShi getInstacne() {
        if (instance == null) {
            instance = new LianJinShuShi();
        }
        return instance;
    }

    private LianJinShuShi() {
        this.setName("LianJinShuShi");
        this.setCost(4);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new DiJing());
        set.add(new ShuShi());
        this.setSpec(set);
    }
}
