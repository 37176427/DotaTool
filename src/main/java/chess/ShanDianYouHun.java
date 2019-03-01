package chess;

import spec.*;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:37
 **/
public class ShanDianYouHun extends Chess{
    private static ShanDianYouHun instance;

    public static ShanDianYouHun getInstacne() {
        if (instance == null) {
            instance = new ShanDianYouHun();
        }
        return instance;
    }

    private ShanDianYouHun() {
        this.setName("ShanDianYouHun");
        this.setCost(3);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new YuanSu());
        set.add(new FaShi());
        this.setSpec(set);
    }
}
