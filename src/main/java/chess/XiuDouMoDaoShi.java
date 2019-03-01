package chess;

import spec.*;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:43
 **/
public class XiuDouMoDaoShi extends Chess {
    private static XiuDouMoDaoShi instance;

    public static XiuDouMoDaoShi getInstacne() {
        if (instance == null) {
            instance = new XiuDouMoDaoShi();
        }
        return instance;
    }

    private XiuDouMoDaoShi() {
        this.setName("XiuDouMoDaoShi");
        this.setCost(3);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new RenLei());
        set.add(new FaShi());
        this.setSpec(set);
    }
}
