package chess;

import spec.*;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:38
 **/
public class HuanYingCiKe extends Chess {
    private static HuanYingCiKe instance;

    public static HuanYingCiKe getInstacne() {
        if (instance == null) {
            instance = new HuanYingCiKe();
        }
        return instance;
    }

    private HuanYingCiKe() {
        this.setName("HuanYingCiKe");
        this.setCost(3);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new JingLing());
        set.add(new CiKe());
        this.setSpec(set);
    }
}
