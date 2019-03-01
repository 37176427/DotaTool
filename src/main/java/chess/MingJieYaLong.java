package chess;

import spec.*;
import spec.Long;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:42
 **/
public class MingJieYaLong extends Chess {
    private static MingJieYaLong instance;

    public static MingJieYaLong getInstacne() {
        if (instance == null) {
            instance = new MingJieYaLong();
        }
        return instance;
    }

    private MingJieYaLong() {
        this.setName("MingJieYaLong");
        this.setCost(3);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new Long());
        set.add(new CiKe());
        this.setSpec(set);
    }
}
