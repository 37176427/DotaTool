package chess;

import spec.EMo;
import spec.RenLei;
import spec.Spec;
import spec.ZhanShi;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:47
 **/
public class HaiJunShangJiang extends Chess{
    private static HaiJunShangJiang instance;

    public static HaiJunShangJiang getInstacne() {
        if (instance == null) {
            instance = new HaiJunShangJiang();
        }
        return instance;
    }

    private HaiJunShangJiang() {
        this.setName("HaiJunShangJiang");
        this.setCost(4);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new RenLei());
        set.add(new ZhanShi());
        this.setSpec(set);
    }
}
