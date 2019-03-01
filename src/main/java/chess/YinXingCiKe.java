package chess;

import spec.*;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:45
 **/
public class YinXingCiKe extends Chess {
    private static YinXingCiKe instance;

    public static YinXingCiKe getInstacne() {
        if (instance == null) {
            instance = new YinXingCiKe();
        }
        return instance;
    }

    private YinXingCiKe() {
        this.setName("YinXingCiKe");
        this.setCost(3);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new SaTe());
        set.add(new CiKe());
        this.setSpec(set);
    }
}
