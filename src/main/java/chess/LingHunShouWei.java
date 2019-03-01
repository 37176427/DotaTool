package chess;

import spec.*;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:43
 **/
public class LingHunShouWei extends Chess {
    private static LingHunShouWei instance;

    public static LingHunShouWei getInstacne() {
        if (instance == null) {
            instance = new LingHunShouWei();
        }
        return instance;
    }

    private LingHunShouWei() {
        this.setName("LingHunShouWei");
        this.setCost(3);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new EMo());
        set.add(new EMoLieShou());
        this.setSpec(set);
    }
}
