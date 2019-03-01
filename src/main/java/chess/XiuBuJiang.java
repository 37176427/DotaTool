package chess;

import spec.*;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 14:36
 **/
public class XiuBuJiang extends Chess {
    private static XiuBuJiang instance;

    public static XiuBuJiang getInstacne() {
        if (instance == null) {
            instance = new XiuBuJiang();
        }
        return instance;
    }

    private XiuBuJiang() {
        this.setName("XiuBuJiang");
        this.setCost(1);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new DiJing());
        set.add(new GongJiang());
        this.setSpec(set);
    }
}
