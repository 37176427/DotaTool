package chess;

import spec.EMo;
import spec.ShuShi;
import spec.Spec;
import spec.YeShou;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:42
 **/
public class YingMo extends Chess {
    private static YingMo instance;

    public static YingMo getInstacne() {
        if (instance == null) {
            instance = new YingMo();
        }
        return instance;
    }

    private YingMo() {
        this.setName("YingMo");
        this.setCost(3);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new EMo());
        set.add(new ShuShi());
        this.setSpec(set);
    }
}
