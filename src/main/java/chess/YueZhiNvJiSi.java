package chess;

import spec.*;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:46
 **/
public class YueZhiNvJiSi extends Chess {
    private static YueZhiNvJiSi instance;

    public static YueZhiNvJiSi getInstacne() {
        if (instance == null) {
            instance = new YueZhiNvJiSi();
        }
        return instance;
    }

    private YueZhiNvJiSi() {
        this.setName("YueZhiNvJiSi");
        this.setCost(3);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new JingLing());
        set.add(new LieRen());
        this.setSpec(set);
    }
}
