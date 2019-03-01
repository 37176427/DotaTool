package chess;

import spec.*;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:48
 **/
public class GuangZhiShouWei extends Chess {
    private static GuangZhiShouWei instance;

    public static GuangZhiShouWei getInstacne() {
        if (instance == null) {
            instance = new GuangZhiShouWei();
        }
        return instance;
    }

    private GuangZhiShouWei() {
        this.setName("GuangZhiShouWei");
        this.setCost(4);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new RenLei());
        set.add(new FaShi());
        this.setSpec(set);
    }
}
