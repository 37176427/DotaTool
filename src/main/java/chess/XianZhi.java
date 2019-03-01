package chess;

import spec.*;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:32
 **/
public class XianZhi extends Chess {
    private static XianZhi instance;

    public static XianZhi getInstacne() {
        if (instance == null) {
            instance = new XianZhi();
        }
        return instance;
    }

    private XianZhi() {
        this.setName("XianZhi");
        this.setCost(2);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new JingLing());
        set.add(new DeLuYi());
        this.setSpec(set);
    }
}
