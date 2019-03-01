package chess;

import spec.*;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:52
 **/
public class LiZhuaDeLuYi extends Chess{
    private static LiZhuaDeLuYi instance;

    public static LiZhuaDeLuYi getInstacne() {
        if (instance == null) {
            instance = new LiZhuaDeLuYi();
        }
        return instance;
    }

    private LiZhuaDeLuYi() {
        this.setName("LiZhuaDeLuYi");
        this.setCost(4);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new YeShou());
        set.add(new DeLuYi());
        this.setSpec(set);
    }
}
