package chess;

import spec.*;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 14:28
 **/
public class ShangJinLieRen extends Chess {
    private static ShangJinLieRen instance;

    public static ShangJinLieRen getInstacne() {
        if (instance == null) {
            instance = new ShangJinLieRen();
        }
        return instance;
    }

    private ShangJinLieRen() {
        this.setName("ShangJinLieRen");
        this.setCost(1);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new DiJing());
        set.add(new CiKe());
        this.setSpec(set);
    }
}
