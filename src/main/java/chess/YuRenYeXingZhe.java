package chess;

import spec.*;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:35
 **/
public class YuRenYeXingZhe extends Chess {
    private static YuRenYeXingZhe instance;

    public static YuRenYeXingZhe getInstacne() {
        if (instance == null) {
            instance = new YuRenYeXingZhe();
        }
        return instance;
    }

    private YuRenYeXingZhe() {
        this.setName("YuRenYeXingZhe");
        this.setCost(2);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new NaJia());
        set.add(new CiKe());
        this.setSpec(set);
    }
}
