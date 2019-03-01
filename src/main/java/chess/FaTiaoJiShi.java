package chess;

import spec.*;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 14:32
 **/
public class FaTiaoJiShi extends Chess {
    private static FaTiaoJiShi instance;

    public static FaTiaoJiShi getInstacne() {
        if (instance == null) {
            instance = new FaTiaoJiShi();
        }
        return instance;
    }

    private FaTiaoJiShi() {
        this.setName("FaTiaoJiShi");
        this.setCost(1);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new DiJing());
        set.add(new GongJiang());
        this.setSpec(set);
    }
}
