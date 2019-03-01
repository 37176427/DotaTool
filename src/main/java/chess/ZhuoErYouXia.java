package chess;

import spec.*;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 14:25
 **/
public class ZhuoErYouXia extends Chess {
    private static ZhuoErYouXia instance;

    public static ZhuoErYouXia getInstacne() {
        if (instance == null) {
            instance = new ZhuoErYouXia();
        }
        return instance;
    }

    private ZhuoErYouXia() {
        this.setName("ZhuoErYouXia");
        this.setCost(1);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new WangLing());
        set.add(new LieRen());
        this.setSpec(set);
    }
}
