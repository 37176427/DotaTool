package chess;

import spec.*;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:54
 **/
public class DiJingGongChengShi extends Chess {
    private static DiJingGongChengShi instance;

    public static DiJingGongChengShi getInstacne() {
        if (instance == null) {
            instance = new DiJingGongChengShi();
        }
        return instance;
    }

    private DiJingGongChengShi() {
        this.setName("DiJingGongChengShi");
        this.setCost(5);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new DiJing());
        set.add(new GongJiang());
        this.setSpec(set);
    }
}
