package chess;

import spec.*;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:27
 **/
public class YuRenShouWei extends Chess {
    private static YuRenShouWei instance;

    public static YuRenShouWei getInstacne() {
        if (instance == null) {
            instance = new YuRenShouWei();
        }
        return instance;
    }

    private YuRenShouWei() {
        this.setName("YuRenShouWei");
        this.setCost(2);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new NaJia());
        set.add(new ZhanShi());
        this.setSpec(set);
    }
}
