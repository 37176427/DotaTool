package chess;

import spec.*;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:29
 **/
public class HunDunQiShi extends Chess {
    private static HunDunQiShi instance;

    public static HunDunQiShi getInstacne() {
        if (instance == null) {
            instance = new HunDunQiShi();
        }
        return instance;
    }

    private HunDunQiShi() {
        this.setName("ShouWang");
        this.setCost(2);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new EMo());
        set.add(new QiShi());
        this.setSpec(set);
    }
}
