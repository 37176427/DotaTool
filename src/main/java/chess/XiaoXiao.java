package chess;

import spec.*;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:17
 **/
public class XiaoXiao extends Chess {
    private static XiaoXiao instance;

    public static XiaoXiao getInstacne() {
        if (instance == null) {
            instance = new XiaoXiao();
        }
        return instance;
    }

    private XiaoXiao() {
        this.setName("XiaoXiao");
        this.setCost(1);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new YuanSu());
        set.add(new ZhanShi());
        this.setSpec(set);
    }
}
