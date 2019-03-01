package chess;

import spec.ShouRen;
import spec.Spec;
import spec.YeShou;
import spec.ZhanShi;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 14:24
 **/
public class JuYaHaiMin extends Chess {
    private static JuYaHaiMin instance;

    public static JuYaHaiMin getInstacne() {
        if (instance == null) {
            instance = new JuYaHaiMin();
        }
        return instance;
    }

    private JuYaHaiMin() {
        this.setName("JuYaHaiMin");
        this.setCost(1);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new YeShou());
        set.add(new ZhanShi());
        this.setSpec(set);
    }
}
