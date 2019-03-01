package chess;

import spec.*;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:50
 **/
public class SheFaNvYao extends Chess {
    private static SheFaNvYao instance;

    public static SheFaNvYao getInstacne() {
        if (instance == null) {
            instance = new SheFaNvYao();
        }
        return instance;
    }

    private SheFaNvYao() {
        this.setName("SheFaNvYao");
        this.setCost(4);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new NaJia());
        set.add(new LieRen());
        this.setSpec(set);
    }
}
