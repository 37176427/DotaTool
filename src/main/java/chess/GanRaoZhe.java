package chess;

import spec.*;

import java.util.HashSet;

/**
 * 描述 ：
 * 作者 ：WYH
 * 时间 ：2019/3/1 16:50
 **/
public class GanRaoZhe extends Chess {
    private static GanRaoZhe instance;

    public static GanRaoZhe getInstacne() {
        if (instance == null) {
            instance = new GanRaoZhe();
        }
        return instance;
    }

    private GanRaoZhe() {
        this.setName("GanRaoZhe");
        this.setCost(4);
        HashSet<Spec> set = new HashSet<Spec>();
        set.add(new ShouRen());
        set.add(new SaManJiSi());
        this.setSpec(set);
    }
}
