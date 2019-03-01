package chess;

import spec.ShouRen;
import spec.Spec;
import spec.ZhanShi;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 11:10
 **/
public class FuWang extends Chess {

    private static FuWang instance;

    public static FuWang getInstacne() {
        if (instance == null) {
            instance = new FuWang();
        }
        return instance;
    }

    private FuWang() {
        this.setName("FuWang");
        this.setCost(1);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new ShouRen());
        set.add(new ZhanShi());
        this.setSpec(set);
    }
}
