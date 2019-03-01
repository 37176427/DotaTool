package chess;

import spec.*;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:22
 **/
public class FaMuJi extends Chess {
    private static FaMuJi instance;

    public static FaMuJi getInstacne() {
        if (instance == null) {
            instance = new FaMuJi();
        }
        return instance;
    }

    private FaMuJi() {
        this.setName("FaMuJi");
        this.setCost(2);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new DiJing());
        set.add(new GongJiang());
        this.setSpec(set);
    }
}
