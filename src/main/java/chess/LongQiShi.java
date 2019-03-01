package chess;

import spec.*;
import spec.Long;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:51
 **/
public class LongQiShi extends Chess {
    private static LongQiShi instance;

    public static LongQiShi getInstacne() {
        if (instance == null) {
            instance = new LongQiShi();
        }
        return instance;
    }

    private LongQiShi() {
        this.setName("LongQiShi");
        this.setCost(4);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new RenLei());
        set.add(new Long());
        set.add(new QiShi());
        this.setSpec(set);
    }
}
