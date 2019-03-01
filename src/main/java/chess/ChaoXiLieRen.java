package chess;

import spec.*;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:53
 **/
public class ChaoXiLieRen extends Chess {
    private static ChaoXiLieRen instance;

    public static ChaoXiLieRen getInstacne() {
        if (instance == null) {
            instance = new ChaoXiLieRen();
        }
        return instance;
    }

    private ChaoXiLieRen() {
        this.setName("ChaoXiLieRen");
        this.setCost(5);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new NaJia());
        set.add(new LieRen());
        this.setSpec(set);
    }
}
