package chess;

import spec.*;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:21
 **/
public class ShouWang extends Chess {
    private static ShouWang instance;

    public static ShouWang getInstacne() {
        if (instance == null) {
            instance = new ShouWang();
        }
        return instance;
    }

    private ShouWang() {
        this.setName("ShouWang");
        this.setCost(2);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new ShouRen());
        set.add(new LieRen());
        this.setSpec(set);
    }
}
