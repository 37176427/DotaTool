package chess;

import spec.*;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:32
 **/
public class YueZhiQiShi extends Chess {
    private static YueZhiQiShi instance;

    public static YueZhiQiShi getInstacne() {
        if (instance == null) {
            instance = new YueZhiQiShi();
        }
        return instance;
    }

    private YueZhiQiShi() {
        this.setName("YueZhiQiShi");
        this.setCost(2);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new JingLing());
        set.add(new QiShi());
        this.setSpec(set);
    }
}
